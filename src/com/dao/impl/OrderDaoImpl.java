package com.dao.impl;

import com.dao.OrderDao;
import com.pojo.Order;

public class OrderDaoImpl extends BasicDAO<Order> implements OrderDao {

    @Override
    public int saveOrder(Order order) {
        String sql="insert into t_order(`order_id`,`create_time`,`price`,`status`,`uid`) values(?,?,?,?,?)";
        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }
}
