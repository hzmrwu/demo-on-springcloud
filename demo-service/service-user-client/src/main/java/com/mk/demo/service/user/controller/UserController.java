package com.mk.demo.service.user.controller;

import com.mk.demo.service.user.api.UserApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mark
 * @date 2020/11/25
 */
@RestController
public class UserController implements UserApi {


    @Override
    public String getOneUserName() {
        return "name mike";
    }
}
