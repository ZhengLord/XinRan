package com.control;

import com.pojo.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/userServlet")
public class UserServlet extends BaseServlet {
    private UserService userService=new UserServiceImpl();

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
            //保存用户登录的信息到session域中
            req.getSession().setAttribute("user",login);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }

    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect(req.getContextPath());

    }

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html;charset-UTF-8");
        String username = req.getParameter("name");
        username = new String(username.getBytes("iso-8859-1"),"UTF-8");
        String password = req.getParameter("password");
        String phone = req.getParameter("tel");
        String sex = req.getParameter("optionsRadiosinline");
        sex=new String(sex.getBytes("iso-8859-1"),"UTF-8");
        String email = req.getParameter("email");

        if (userService.checkTel(phone)){
            System.out.println("该手机号 "+phone+" 已注册");
            System.out.println(username);
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

}
