package com.service;

import com.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
