package com.mk.demo.service.shop;

import com.mk.demo.service.user.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mark
 * @date 2020/11/26
 */
@EnableFeignClients(basePackages = "com.mk.demo")
@RestController
@SpringBootApplication(scanBasePackages = "com.mk.demo.service")
public class ShopApplication {

    @Autowired
    private UserApi userApi;

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @GetMapping("/shop/test")
    public String test() {
        return userApi.getOneUserName();
    }
}
