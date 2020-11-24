package com.mk.demo.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mark
 * @date 2020/11/24
 */
@RestController
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @GetMapping("/user/test")
    public String test() {
        return "user test ok";
    }

    @Autowired
    private SampleRedisConfig redisConfig;

    @Value("${abc}")
    private String abc;

    @GetMapping("/user/test/config/get")
    public Object getConfig() {
        System.out.println(abc);
        return redisConfig.getExpireSeconds();
    }
}
