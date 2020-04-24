package com.sptr.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.sptr.cart.mapper"})
@SpringBootApplication
@EnableEurekaClient
public class SptrCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SptrCartApplication.class, args);
    }

}
