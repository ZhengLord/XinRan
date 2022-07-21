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

@WebServlet(name = "RegisterServlet", value = "/registerServlet")
public class RegisterServlet extends HttpServlet {
    private UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("sssssssssss");
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("name");
        String password = req.getParameter("password");
//        String rpassword = req.getParameter("rpassword");
        String phone = req.getParameter("tel");
        String sex = req.getParameter("optionsRadiosinline");
        String email = req.getParameter("email");

//        try {
//            User user = new User();
//            System.out.println("注入之前："+user);
//            BeanUtils.populate(user,req.getParameterMap());
//            System.out.println("注入之后："+user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        if (userService.checkTel(phone)){
                System.out.println("该手机号 "+phone+" 已注册");
                //回显信息，保存到request域中
                req.setAttribute("info", "手机号已存在");
                req.setAttribute("username",username);
                req.setAttribute("email",email);
                req.getRequestDispatcher("/register.jsp").forward(req,resp);
            }else {
                boolean result = userService.register(new User(null, username, password, sex, null, phone, email));
                if (result) {
                    req.getRequestDispatcher("/index.jsp").forward(req, resp);
                }else {
                    req.getRequestDispatcher("/register.jsp").forward(req,resp);
                }
            }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
