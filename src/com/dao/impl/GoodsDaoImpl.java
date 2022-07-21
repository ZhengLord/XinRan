package com.dao.impl;

import com.dao.GoodsDao;
import com.pojo.Goods;
import java.util.List;

public class GoodsDaoImpl extends BasicDAO<Goods> implements GoodsDao {
    @Override
    public int addGoods(Goods goods) {
        String sql="INSERT INTO goods(`name`,price,sales,stock,img_path,category) VALUES(?,?,?,?,?,?)";
        return update(sql,goods.getName(),goods.getPrice(),goods.getSales(),goods.getStock(),goods.getImgPath(),goods.getCategory());
    }

    @Override
    public int deleteGoodsById(Integer id) {
        String sql="delete from goods where id=?";
        return update(sql,id);
    }

    @Override
    public int updateGoods(Goods goods) {
        String sql="update goods set `name`=?,price=?,sales=?,stock=?,img_path=?,category=? where id=?";
        return update(sql,goods.getName(),goods.getPrice(),goods.getSales(),goods.getStock(),
                goods.getImgPath(),goods.getCategory(),goods.getId());
    }

    @Override
    public Goods queryGoodsById(Integer id) {
        String sql="select `id`,`name`,price,sales,stock,img_path imgPath,category from goods where id=?";
        return querySingle(sql,Goods.class,id);
    }

    @Override
    public List<Goods> queryGoods() {
        String sql="select `id`,`name`,price,sales,stock,img_path imgPath,category from goods";
        return queryMulti(sql,Goods.class);
    }

    @Override
    public List<Goods> queryGoodsByCategory(Integer category) {
        String sql="select `id`,`name`,price,sales,stock,img_path imgPath,category from goods where category=?";
        return queryMulti(sql,Goods.class,category);
    }
}
