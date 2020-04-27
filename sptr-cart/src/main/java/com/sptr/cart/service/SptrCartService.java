package com.sptr.cart.service;

import com.sptr.cart.req.AddCartReq;
import com.sptr.cart.req.EditCartReq;

/**
 * @author：lianp
 * @description：
 * @date：16:47 2020/4/24
 */
public interface SptrCartService {
    void add(AddCartReq req);

    void edit(EditCartReq req);
}
