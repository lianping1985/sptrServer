package com.sptr.item.service;

import com.sptr.item.domain.SptrItem;
import com.sptr.item.domain.SptrItemDetailPic;
import com.sptr.item.domain.SptrItemRollingPic;
import java.util.List;

/**
 * @author：lianp
 * @description：
 * @date：19:59 2020/4/14
 */
public interface SptrItemService {

    List<SptrItem> listItems(Integer showType);

    List<SptrItemRollingPic> rollingPics(Long itemId);

    List<SptrItemDetailPic> detailPics(Long itemId);

}
