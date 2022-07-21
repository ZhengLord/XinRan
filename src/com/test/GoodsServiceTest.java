package com.test;

import com.pojo.Goods;
import com.service.GoodsService;
import com.service.impl.GoodsServiceImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class GoodsServiceTest {
    private GoodsService goodsService=new GoodsServiceImpl();

    @Test
    void addGoods() {
        goodsService.addGoods(new Goods(null,"小米手机",new BigDecimal(2999),1000,8,null));
    }

    @Test
    void deleteGoodsById() {
        goodsService.deleteGoodsById(6);
    }

    @Test
    void updateGoods() {
        goodsService.updateGoods(new Goods(6,"华为",new BigDecimal(4000),1000,8,null));
    }

    @Test
    void queryBookById() {
        System.out.println(goodsService.queryGoodsById(6));
    }

    @Test
    void queryGoods() {
        for (Goods goods:goodsService.queryGoods()){
            System.out.println(goods);
        }
    }
}