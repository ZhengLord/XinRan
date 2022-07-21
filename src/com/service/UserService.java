package com.service;

import com.pojo.User;

public interface UserService {
    public boolean register(User user);

    public User login(User user);

    public boolean checkTel(String phone);

}
