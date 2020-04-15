package com.sptr.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.sptr.item.mapper"})
@SpringBootApplication
@EnableEurekaClient
public class SptrItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SptrItemApplication.class, args);
    }

}
