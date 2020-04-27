package com.sptr.cart.mapper;

import com.sptr.cart.domain.SptrCart;
import com.sptr.cart.domain.SptrCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SptrCartMapper {
    int countByExample(SptrCartExample example);

    int deleteByExample(SptrCartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SptrCart record);

    int insertSelective(SptrCart record);

    List<SptrCart> selectByExample(SptrCartExample example);

    SptrCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SptrCart record, @Param("example") SptrCartExample example);

    int updateByExample(@Param("record") SptrCart record, @Param("example") SptrCartExample example);

    int updateByPrimaryKeySelective(SptrCart record);

    int updateByPrimaryKey(SptrCart record);
}