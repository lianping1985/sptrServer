package com.sptr.cart.controller;


import com.sptr.cart.req.AddCartReq;
import com.sptr.cart.req.EditCartReq;
import com.sptr.cart.service.SptrCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    SptrCartService sptrCartService;

    @PostMapping("/add")
    public void add(@RequestBody AddCartReq req){
        sptrCartService.add(req);
    }

    @PostMapping("/edit")
    public void edit(@RequestBody EditCartReq req){
        sptrCartService.edit(req);
    }

    @GetMapping("/query")
    public void query(){
//        sptrCartService.query();
    }



}
