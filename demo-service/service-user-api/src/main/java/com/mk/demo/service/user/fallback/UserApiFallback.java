package com.mk.demo.service.user.fallback;

import com.mk.demo.service.user.api.UserApi;
import org.springframework.stereotype.Component;

/**
 * @author Mark
 * @date 2020/11/26
 */
@Component
public class UserApiFallback implements UserApi {
    @Override
    public String getOneUserName() {
        return "匿名";
    }
}
