package com.sptr.user.service.impl;

import com.sptr.user.common.BaseRedisService;
import com.sptr.user.domain.SptrUser;
import com.sptr.user.domain.SptrUserExample;
import com.sptr.user.mapper.SptrUserMapper;
import com.sptr.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author：lianp
 * @description：
 * @date：17:22 2020/4/2
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BaseRedisService baseRedisService;

    @Autowired
    SptrUserMapper sptrUserMapper;

    private static final Long EXPIRES = 86400L;

    @Override
    public void saveOrUpdate(SptrUser sptrUser) {
        SptrUser user = sptrUserMapper.findByOpenId(sptrUser.getOpenId());
        if(null==user){
            sptrUserMapper.insert(user);
        }else{
            SptrUserExample example = new SptrUserExample();
            example.createCriteria().andOpenIdEqualTo(sptrUser.getOpenId());
            sptrUserMapper.updateByExampleSelective(sptrUser,example);
        }
    }
}
