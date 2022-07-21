package com.test;

import com.pojo.Cart;
import com.pojo.CartItem;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void addItem() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(2,"外套",1,new BigDecimal(250),new BigDecimal(250)));

        System.out.println(cart);
    }

    @Test
    void deleteItem() {

    }

    @Test
    void clear() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(2,"外套",1,new BigDecimal(250),new BigDecimal(250)));
        cart.clear();
        System.out.println(cart);
    }

    @Test
    void updateCount() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(1,"卫衣",1,new BigDecimal(185),new BigDecimal(185)));
        cart.addItem(new CartItem(2,"外套",1,new BigDecimal(250),new BigDecimal(250)));
        cart.updateCount(1,10);
        System.out.println(cart);
    }
}