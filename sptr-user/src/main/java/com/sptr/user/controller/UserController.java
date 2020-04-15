package com.sptr.user.controller;

import com.sptr.user.domain.SptrUser;
import com.sptr.user.service.UserService;
import com.sptr.user.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/wechat/save")
    public String save(@RequestBody SptrUser sptrUser){
        System.out.println("-----------------------------save");
        userService.saveOrUpdate(sptrUser);
        return sptrUser.getOpenId();
    }

    @PostMapping("/wechat/update")
    public String update(@RequestBody SptrUser sptrUser, HttpServletRequest request){
        String authorization = request.getHeader("Authorization");
        String token=authorization.replace("Bearer ","");
        String userSymbol = JWTUtil.getUserSymbol(token);
        sptrUser.setOpenId(userSymbol);
        System.out.println("-----------------------------update");
        userService.saveOrUpdate(sptrUser);
        return sptrUser.getOpenId();
    }
}
