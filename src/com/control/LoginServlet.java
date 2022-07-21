package com.control;

import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.pojo.User;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "LoginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("dddddddddddd");
        String phone = req.getParameter("tel");
        String password = req.getParameter("password");
        User login = userService.login(new User(null, null, password, null, null, phone, null));
        if (login==null){
            //登录失败
            System.out.println("登录失败");
            req.setAttribute("info","手机号或者密码错误");
            req.setAttribute("phone",phone);
            req.getRequestDispatcher("/login.jsp").forward(req, resp);

        }else {
            System.out.println("登录成功");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
