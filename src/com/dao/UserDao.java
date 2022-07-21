package com.dao;

import com.pojo.User;

public interface UserDao {
    //根据手机号查询用户信息
    public User queryUserByPhone(String phone);

    //保存用户信息
    public int savaUser(User user );

    //
    public User queryUserByPhoneAndPassword(String phone,String password);
}
