package com.sptr.auth.api;

import com.sptr.auth.common.SptrUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author：lianp
 * @description：
 * @date：13:57 2020/4/9
 */
@FeignClient(name = "sptr-user")
public interface UserRemoteService {

    @PostMapping("sptr/user/wechat/save")
    void save(@RequestBody SptrUserInfo sptrUserInfo);

    @PostMapping("sptr/user/wechat/update")
    void update(@RequestBody SptrUserInfo sptrUserInfo);
}
