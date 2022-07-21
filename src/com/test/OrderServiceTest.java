package com.test;

import com.pojo.Cart;
import com.pojo.CartItem;
import com.service.OrderService;
import com.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void createOrder() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(2,"外套",1,new BigDecimal(250),new BigDecimal(250)));
        OrderService orderService=new OrderServiceImpl();
        System.out.println(orderService.createOrder(cart,1));

    }
}