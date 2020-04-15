package com.sptr.item.mapper;

import com.sptr.item.domain.SptrItem;
import com.sptr.item.domain.SptrItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SptrItemMapper {
    int countByExample(SptrItemExample example);

    int deleteByExample(SptrItemExample example);

    int insert(SptrItem record);

    int insertSelective(SptrItem record);

    List<SptrItem> selectByExample(SptrItemExample example);

    int updateByExampleSelective(@Param("record") SptrItem record, @Param("example") SptrItemExample example);

    int updateByExample(@Param("record") SptrItem record, @Param("example") SptrItemExample example);

    List<SptrItem> listItems(@Param("showType") Integer showType);
}