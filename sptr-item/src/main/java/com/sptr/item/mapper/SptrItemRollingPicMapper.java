package com.sptr.item.mapper;

import com.sptr.item.domain.SptrItemRollingPic;
import com.sptr.item.domain.SptrItemRollingPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SptrItemRollingPicMapper {
    int countByExample(SptrItemRollingPicExample example);

    int deleteByExample(SptrItemRollingPicExample example);

    int insert(SptrItemRollingPic record);

    int insertSelective(SptrItemRollingPic record);

    List<SptrItemRollingPic> selectByExample(SptrItemRollingPicExample example);

    int updateByExampleSelective(@Param("record") SptrItemRollingPic record, @Param("example") SptrItemRollingPicExample example);

    int updateByExample(@Param("record") SptrItemRollingPic record, @Param("example") SptrItemRollingPicExample example);
}