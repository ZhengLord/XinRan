package com.test;

import com.dao.GoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.pojo.Goods;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GoodsDaoTest {
    private GoodsDao goodsDao=new GoodsDaoImpl();

    @Test
    void addGoods() {
        goodsDao.addGoods(new Goods(null,"风衣",new BigDecimal(180),200,50,"image/cloth4.jpg",1));
    }

    @Test
    void deleteGoodsById() {
        goodsDao.deleteGoodsById(4);
    }

    @Test
    void updateGoods() {
        goodsDao.updateGoods(new Goods(4,"华为",new BigDecimal(4000),1000,8,null,4));
    }

    @Test
    void queryGoodsById() {
        System.out.println(goodsDao.queryGoodsById(4));
    }

    @Test
    void queryGoods() {
        for (Goods goods:goodsDao.queryGoods()){
            System.out.println(goods);
        }
    }
    @Test
    void queryGoodsByCategory(){
        for (Goods goods:goodsDao.queryGoodsByCategory(1)){
            System.out.println(goods);
        }
    }
}