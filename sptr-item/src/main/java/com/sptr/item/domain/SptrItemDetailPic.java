package com.sptr.item.domain;

import lombok.Data;

@Data
public class SptrItemDetailPic {
    private Long id;

    private Long itemId;

    private String detailPicUrl;

    private Integer picSort;
}