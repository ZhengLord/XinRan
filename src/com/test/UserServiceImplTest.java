package com.test;

import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.pojo.User;
import org.junit.jupiter.api.Test;

class UserServiceImplTest {
    UserService userService=new UserServiceImpl();

    @Test
    void register() {
        userService.register(new User(null,"小红","12345678","女","湖南","11111111111","xiaohong@qq.com"));
    }

    @Test
    void login() {
        System.out.println(userService.login(new User(null,"小红","12345678","女","湖南","11111111111","xiaohong@qq.com")));
    }

    @Test
    void checkTel() {
        if (userService.checkTel("11111111112")){
            System.out.println("用户已存在");
        }else {
            System.out.println("该电话号码可用");
        }

    }
}