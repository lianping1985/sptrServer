package com.sptr.item.service.impl;

import com.sptr.item.domain.*;
import com.sptr.item.mapper.SptrItemDetailPicMapper;
import com.sptr.item.mapper.SptrItemMapper;
import com.sptr.item.mapper.SptrItemRollingPicMapper;
import com.sptr.item.service.SptrItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author：lianp
 * @description：
 * @date：19:59 2020/4/14
 */
@Service
public class SptrItemServiceImpl  implements SptrItemService {

    @Autowired
    SptrItemMapper sptrItemMapper;
    @Autowired
    SptrItemRollingPicMapper sptrItemRollingPicMapper;
    @Autowired
    SptrItemDetailPicMapper sptrItemDetailPicMapper;

    @Override
    public List<SptrItem> listItems(Integer showType) {
        return sptrItemMapper.listItems(showType);
    }

    @Override
    public List<SptrItemRollingPic> rollingPics(Long itemId) {
        SptrItemRollingPicExample example = new SptrItemRollingPicExample();
        example.createCriteria().andItemIdEqualTo(itemId);
        example.setOrderByClause("pic_sort");
        return sptrItemRollingPicMapper.selectByExample(example);
    }

    @Override
    public List<SptrItemDetailPic> detailPics(Long itemId) {
        SptrItemDetailPicExample example = new SptrItemDetailPicExample();
        example.createCriteria().andItemIdEqualTo(itemId);
        example.setOrderByClause("pic_sort");
        return sptrItemDetailPicMapper.selectByExample(example);
    }
}
