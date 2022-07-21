package com.control;

import com.google.gson.Gson;
import com.pojo.Cart;
import com.pojo.CartItem;
import com.pojo.Goods;
import com.service.GoodsService;
import com.service.impl.GoodsServiceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "CartServlet", value = "/cartServlet")
public class CartServlet extends BaseServlet{
    private GoodsService goodsService=new GoodsServiceImpl();

    protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取请求的参数 商品编号
        int id = WebUtils.parseInt(req.getParameter("id"), 0);

        Goods goods = goodsService.queryGoodsById(id);
        // 把商品信息，转换成为CartItem商品项
        CartItem cartItem = new CartItem(goods.getId(),goods.getName(),1,goods.getPrice(),goods.getPrice(),goods.getImgPath());
         //调用Cart.addItem(CartItem);添加商品项
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            req.getSession().setAttribute("cart",cart);
        }

        cart.addItem(cartItem);

        // 重定向回原来商品所在的地址页面
        resp.sendRedirect(req.getHeader("Referer"));
    }

    protected void deleteItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart != null) {
            cart.deleteItem(id);
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    protected void updateCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        int count=WebUtils.parseInt(req.getParameter("count"),1);
        //获取对象
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        System.out.println(cart);
        System.out.println("count="+count);
        if (cart != null) {
            cart.updateCount(id,count);
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    protected void clear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart != null) {
            cart.clear();
            resp.sendRedirect(req.getHeader("Referer"));
        }

    }

    protected void ajaxAddItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取请求的参数 商品编号
        int id = WebUtils.parseInt(req.getParameter("id"), 0);

        Goods goods = goodsService.queryGoodsById(id);
        // 把商品信息，转换成为CartItem商品项
        CartItem cartItem = new CartItem(goods.getId(),goods.getName(),1,goods.getPrice(),goods.getPrice(),goods.getImgPath());
        //调用Cart.addItem(CartItem);添加商品项
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            req.getSession().setAttribute("cart",cart);
        }

        cart.addItem(cartItem);
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("totalCount",cart.getTotalCount());
        resultMap.put("lastName",cartItem.getName());
        Gson gson = new Gson();
        String resultMapJsonString = gson.toJson(resultMap);
        resp.getWriter().write(resultMapJsonString);



    }



}
