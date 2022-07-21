package com.control;

import com.pojo.Cart;
import com.pojo.User;
import com.service.OrderService;
import com.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "OrderServlet", value = "/orderServlet")
public class OrderServlet extends BaseServlet{
    private OrderService orderService=new OrderServiceImpl();

    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        User loginUser = (User) req.getSession().getAttribute("user");
        Integer userId = loginUser.getId();
        String orderId = orderService.createOrder(cart, userId);
        System.out.println(orderId);
        req.getSession().setAttribute("orderId",orderId);
        resp.sendRedirect(req.getContextPath()+"/checkout.jsp");

    }
}
