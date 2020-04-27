package com.sptr.cart.service.impl;

import com.sptr.cart.domain.SptrCart;
import com.sptr.cart.mapper.SptrCartMapper;
import com.sptr.cart.req.AddCartReq;
import com.sptr.cart.req.EditCartReq;
import com.sptr.cart.service.SptrCartService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author：lianp
 * @description：
 * @date：16:48 2020/4/24
 */
@Service
public class SptrCartServiceImpl implements SptrCartService {
    @Autowired
    SptrCartMapper sptrCartMapper;

    @Override
    public void add(AddCartReq req) {
        SptrCart cart = new SptrCart();
        createCart(req,cart);
        sptrCartMapper.insert(cart);
    }

    @Override
    public void edit(EditCartReq req) {
        SptrCart cart = new SptrCart();
        createEditCart(req,cart);
        sptrCartMapper.updateByPrimaryKeySelective(cart);
    }

    void createCart(AddCartReq req, SptrCart cart){
        BeanUtils.copyProperties(req,cart);

    }

    void createEditCart(EditCartReq req, SptrCart cart){
        BeanUtils.copyProperties(req,cart);

    }
}
