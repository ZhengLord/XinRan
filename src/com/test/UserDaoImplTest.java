package com.test;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import org.junit.jupiter.api.Test;

class UserDaoImplTest {

    @Test
    void queryUserByPhone() {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.queryUserByPhone("18988889999");
        System.out.println(user);
    }

    @Test
    void savaUser() {
        UserDao userDao = new UserDaoImpl();
        if (userDao.savaUser(new User(null,"小明","12345678","男","上海","13800001111","xiaoming@163.com"))>0){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }

    }

    @Test
    void queryUserByPhoneAndPassword() {
        UserDao userDao = new UserDaoImpl();
        if (userDao.queryUserByPhoneAndPassword("18988889999","1345678")==null){
            System.out.println("用户名或者密码错误，登录失败");
        }else {
            System.out.println("登录成功");
        }
    }
}