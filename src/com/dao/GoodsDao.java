package com.dao;

import com.pojo.Goods;

import java.awt.*;
import java.awt.print.Book;
import java.util.List;

public interface GoodsDao {
    public int addGoods(Goods goods);

    public int deleteGoodsById(Integer id);

    public int updateGoods(Goods goods);

    public Goods queryGoodsById(Integer id);

    public List<Goods> queryGoods();

    public List<Goods> queryGoodsByCategory(Integer category);
}
