package com.sptr.cart.domain;

import lombok.Data;

@Data
public class SptrCart {
    private Long id;

    private Long itemId;

    private Long userId;

    private Integer buyNum;
}