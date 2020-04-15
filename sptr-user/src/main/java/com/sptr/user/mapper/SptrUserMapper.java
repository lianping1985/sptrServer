package com.sptr.user.mapper;

import com.sptr.user.domain.SptrUser;
import com.sptr.user.domain.SptrUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SptrUserMapper {
    int countByExample(SptrUserExample example);

    int deleteByExample(SptrUserExample example);

    int insert(SptrUser record);

    int insertSelective(SptrUser record);

    List<SptrUser> selectByExample(SptrUserExample example);

    int updateByExampleSelective(@Param("record") SptrUser record, @Param("example") SptrUserExample example);

    int updateByExample(@Param("record") SptrUser record, @Param("example") SptrUserExample example);

    SptrUser findByOpenId(@Param("openId") String openId);
}