package com.sptr.auth.controller;

import com.sptr.auth.api.UserRemoteService;
import com.sptr.auth.bo.WechatCode;
import com.sptr.auth.common.AuthResult;
import com.sptr.auth.common.HttpClientResult;
import com.sptr.auth.common.SptrUserInfo;
import com.sptr.auth.common.WechatCodeAuthResponse;
import com.sptr.auth.utils.HttpClientUtil;
import com.sptr.auth.utils.JWTUtil;
import com.sptr.auth.utils.Uuid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.apache.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import com.alibaba.fastjson.JSON;

/**
 * @author：lianp
 * @description：
 * @date：19:14 2020/4/8
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    UserRemoteService userRemoteService;

    /**
     * 登录认证
     * @param username 用户名
     * @param password 密码
     */
    @GetMapping("/login")
    public AuthResult login(@RequestParam String username, @RequestParam String password) {
        if("admin".equals(username) && "admin".equals(password)){
            //生成token
            String token = JWTUtil.generateToken(username);

            //生成refreshToken
            String refreshToken = Uuid.genUuid();

            //数据放入redis
            redisTemplate.opsForHash().put(refreshToken, "token", token);
            redisTemplate.opsForHash().put(refreshToken, "userSymbol", username);

            //设置token的过期时间
            redisTemplate.expire(refreshToken, JWTUtil.REFRESH_TOKEN_EXPIRE_TIME, TimeUnit.MILLISECONDS);

            return new AuthResult(0, "success", token, refreshToken);
        }else{
            return new AuthResult(1001, "username or password error");
        }
    }

    /**
     * 微信小程序登录认证
     * @param wechatCode
     */
    @PostMapping("/wechatLogin")
    public AuthResult wechatLogin(@RequestBody WechatCode wechatCode) {
        try {
            WechatCodeAuthResponse res = getWechatOpenid(wechatCode.getCode());
            String wxOpenId = res.getOpenid();
//            String wxSessionKey = res.getSessionKey();
            //生成token
            String token = JWTUtil.generateToken(wxOpenId);
            //生成refreshToken
            String refreshToken = Uuid.genUuid();
            //数据放入redis
            redisTemplate.opsForHash().put(refreshToken, "token", token);
            redisTemplate.opsForHash().put(refreshToken, "userSymbol", wxOpenId);
            //设置token的过期时间
            redisTemplate.expire(refreshToken, JWTUtil.REFRESH_TOKEN_EXPIRE_TIME, TimeUnit.MILLISECONDS);

            //保存到mysql
            SptrUserInfo sptrUserInfo = new SptrUserInfo();
            sptrUserInfo.setOpenId(wxOpenId);
            userRemoteService.save(sptrUserInfo);

            return new AuthResult(0, "success", token, refreshToken);
        }catch (Exception e){
            return new AuthResult(1002, e.getMessage());
        }
    }

    public WechatCodeAuthResponse getWechatOpenid(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String, String> param = new HashMap<>();
        param.put("appid", "wx5f75d6a0e418150e");
        param.put("secret", "e31daa2c93ac3092d36e308f2aad7778");
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");
        HttpClientResult wxResult = null;
        try {
            wxResult = HttpClientUtil.doGet(url, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(code==null || HttpStatus.SC_OK != wxResult.getCode()){
            throw new RuntimeException("调用微信获取openid接口失败");
        }
        WechatCodeAuthResponse response = JSON.parseObject(wxResult.getContent(), WechatCodeAuthResponse.class);
        if(response.getErrcode()!=null){
            throw new RuntimeException(response.getErrmsg());
        }
        return response;
    }

    /**
     * 刷新token
     */
    @GetMapping("/refreshToken")
    public AuthResult refreshToken(@RequestParam String refreshToken) {
        String userSymbol = (String)redisTemplate.opsForHash().get(refreshToken, "userSymbol");
        if(StringUtils.isEmpty(userSymbol)){
            return new AuthResult(1003, "refreshToken error");
        }

        //生成新的token
        String newToken = JWTUtil.generateToken(userSymbol);
        redisTemplate.opsForHash().put(refreshToken, "token", newToken);
        return new AuthResult(0, "success", newToken, refreshToken);
    }

    @GetMapping("/")
    public String index() {
        return "auth-service: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
