package com.service.impl;

import com.dao.OrderDao;
import com.dao.OrderItemDao;
import com.dao.impl.OrderDaoImpl;
import com.dao.impl.OrderItemDaoImpl;
import com.pojo.Cart;
import com.pojo.CartItem;
import com.pojo.Order;
import com.pojo.OrderItem;
import com.service.OrderService;

import java.util.Date;
import java.util.Map;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao=new OrderDaoImpl();
    private OrderItemDao orderItemDao=new OrderItemDaoImpl();
    @Override
    public String createOrder(Cart cart, Integer userId) {
        String orderId=System.currentTimeMillis()+"";
        Order order=new Order(orderId,new Date(),cart.getTotalPrice(),0,userId);
        orderDao.saveOrder(order);
        for(Map.Entry<Integer, CartItem>entry: cart.getItems().entrySet()){
            CartItem cartItem = entry.getValue();
            OrderItem orderItem = new OrderItem(null, cartItem.getName(), cartItem.getCount(), cartItem.getPrice(), cartItem.getTotalPrice(), orderId);
            orderItemDao.saveOrderItem(orderItem);
        }
        cart.clear();
        return orderId;

    }
}
