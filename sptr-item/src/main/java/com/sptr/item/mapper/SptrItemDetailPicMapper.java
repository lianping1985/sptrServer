package com.sptr.item.mapper;

import com.sptr.item.domain.SptrItemDetailPic;
import com.sptr.item.domain.SptrItemDetailPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SptrItemDetailPicMapper {
    int countByExample(SptrItemDetailPicExample example);

    int deleteByExample(SptrItemDetailPicExample example);

    int insert(SptrItemDetailPic record);

    int insertSelective(SptrItemDetailPic record);

    List<SptrItemDetailPic> selectByExample(SptrItemDetailPicExample example);

    int updateByExampleSelective(@Param("record") SptrItemDetailPic record, @Param("example") SptrItemDetailPicExample example);

    int updateByExample(@Param("record") SptrItemDetailPic record, @Param("example") SptrItemDetailPicExample example);
}