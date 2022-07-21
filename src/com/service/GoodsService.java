package com.service;

import com.pojo.Goods;

import java.util.List;

public interface GoodsService {
    public void addGoods(Goods goods);

    public void deleteGoodsById(Integer id);

    public void updateGoods(Goods goods);

    public Goods queryGoodsById(Integer id);

    public List<Goods> queryGoods();

    public List<Goods> queryGoodsByCategory(Integer category);
}
