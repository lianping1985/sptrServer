package com.sptr.item.domain;

import lombok.Data;

@Data
public class SptrItemRollingPic {
    private Long id;

    private Long itemId;

    private String rollingPicUrl;

    private Integer picSort;
}