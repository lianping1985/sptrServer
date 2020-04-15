package com.sptr.user.service;

import com.sptr.user.domain.SptrUser;

/**
 * @author：lianp
 * @description：
 * @date：17:22 2020/4/2
 */
public interface UserService {
    void saveOrUpdate(SptrUser sptrUserInfo);
}
