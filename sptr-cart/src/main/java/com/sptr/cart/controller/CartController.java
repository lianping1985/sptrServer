package com.sptr.cart.controller;


import com.sptr.cart.req.AddCartReq;
import com.sptr.cart.service.SptrCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class CartController {

    @Autowired
    SptrCartService sptrCartService;

    @PostMapping("/add")
    public void add(@RequestBody AddCartReq addCartReq){
        sptrCartService.add(addCartReq);
    }



}
