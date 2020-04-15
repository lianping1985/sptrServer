package com.sptr.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"com.sptr.user.mapper"})
@SpringBootApplication
@EnableEurekaClient
public class SptrUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SptrUserApplication.class, args);
    }

}
