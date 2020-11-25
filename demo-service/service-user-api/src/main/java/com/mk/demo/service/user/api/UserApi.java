package com.mk.demo.service.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mark
 * @date 2020/11/25
 */
@FeignClient(name = "service-user")
public interface UserApi {

    @GetMapping("/user/name/one")
    String getOneUserName();
}
