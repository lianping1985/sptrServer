package com.sptr.cart.req;

import lombok.Data;

/**
 * @author：lianp
 * @description：
 * @date：17:00 2020/4/24
 */
@Data
public class AddCartReq {
    Long itemId;
    Integer buyNum;
}
