package com.sptr.item.controller;

import com.sptr.item.domain.SptrItem;
import com.sptr.item.domain.SptrItemDetailPic;
import com.sptr.item.domain.SptrItemRollingPic;
import com.sptr.item.service.SptrItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    SptrItemService sptrItemService;

    @GetMapping("/list")
    public List<SptrItem> list(){
        return sptrItemService.listItems(4);
    }

    @GetMapping("/topList")
    public List<SptrItem> topList(){
        return sptrItemService.listItems(1);
    }

    @GetMapping("/hotList")
    public List<SptrItem> hotList(){
        return sptrItemService.listItems(2);
    }

    @GetMapping("/newList")
    public List<SptrItem> newList(){
        return sptrItemService.listItems(3);
    }

    @GetMapping("/rollingPics")
    public List<SptrItemRollingPic> rollingPics(Long itemId){
        return sptrItemService.rollingPics(itemId);
    }

    @GetMapping("/detailPics")
    public List<SptrItemDetailPic> detailPics(Long itemId){
        return sptrItemService.detailPics(itemId);
    }

}
