package com.service.impl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.service.UserService;
import com.pojo.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();//面向接口的编程
    @Override
    public boolean register(User user) {
        int i = userDao.savaUser(user);
        return i>0?true:false;
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByPhoneAndPassword(user.getPhone(),user.getPassword());
    }

    @Override
    public boolean checkTel(String phone) {
        if (userDao.queryUserByPhone(phone)==null){
            return false;
        }
        return true;
    }
}
