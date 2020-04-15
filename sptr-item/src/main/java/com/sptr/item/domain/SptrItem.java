package com.sptr.item.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class SptrItem {
    private Long id;

    private String itemName;

    private String itemDesc;

    private String itemPic;

    private String itemPicHot;

    private String itemPicNew;

    private String itemPicTop;

    private String itemUnit;

    private Integer buyStartUp;

    private BigDecimal price;

    private BigDecimal priceDiscount;

    private Long sellerId;

    private Integer itemStatus;

    private Integer itemShowType;

    private String itemCategory;

    private Long createUserId;

    private Date createTime;
}