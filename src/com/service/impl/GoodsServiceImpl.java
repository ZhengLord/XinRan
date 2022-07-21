package com.service.impl;

import com.dao.GoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.pojo.Goods;
import com.service.GoodsService;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    private GoodsDao goodsDao=new GoodsDaoImpl();
    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public void deleteGoodsById(Integer id) {
        goodsDao.deleteGoodsById(id);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsDao.updateGoods(goods);

    }

    @Override
    public Goods queryGoodsById(Integer id) {
        return goodsDao.queryGoodsById(id);
    }

    @Override
    public List<Goods> queryGoods() {
        return goodsDao.queryGoods();
    }

    @Override
    public List<Goods> queryGoodsByCategory(Integer category) {
        return goodsDao.queryGoodsByCategory(category);
    }
}
