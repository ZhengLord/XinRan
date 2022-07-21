package com.dao.impl;

import com.dao.UserDao;
import com.pojo.User;

public class UserDaoImpl extends BasicDAO<User> implements UserDao {

    @Override
    public User queryUserByPhone(String phone) {
        String sql="select * from users where phone=?";
        return querySingle(sql,User.class,phone);
    }

    @Override
    public int savaUser(User user) {

        String sql="insert into  users(username,`password`,sex,address,phone,email) values(?,?,?,?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getSex(), user.getAddress(),user.getPhone(),user.getEmail());

    }

    @Override
    public User queryUserByPhoneAndPassword(String phone, String password) {
        String sql="select * from users where phone=? and password=?";
        return querySingle(sql,User.class,phone,password);
    }
}
