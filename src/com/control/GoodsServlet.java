package com.control;

import com.pojo.Goods;
import com.service.GoodsService;
import com.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GoodsServlet", value = "/goodsServlet")
public class GoodsServlet extends BaseServlet{
    private GoodsService goodsService=new GoodsServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.通过GoodsService查询全部商品
        List<Goods> goods = goodsService.queryGoods();
        //2.把全部商品保存到request域中
        req.setAttribute("goods",goods);
        //3.请求转发到管理页面
        req.getRequestDispatcher("/goodsmanagement.jsp").forward(req,resp);

    }

    protected void list1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.通过GoodsService查询全部商品
        String category = req.getParameter("category");
//        System.out.println("category ="+category);
        List<Goods> goods = goodsService.queryGoodsByCategory(Integer.parseInt(category));
        //2.把全部商品保存到request域中
        req.setAttribute("goods",goods);
        //3.请求转发到管理页面
        req.getRequestDispatcher("/show.jsp").forward(req,resp);

    }
}
