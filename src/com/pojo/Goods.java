package com.pojo;

import java.math.BigDecimal;

public class Goods {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer sales;
    private Integer stock;
    private String imgPath="web/image/cloth1";
    private Integer category;

    public Goods(Integer id, String name, BigDecimal price, Integer sales, Integer stock, String imgPath) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
        if(imgPath!=null&&!"".equals(imgPath)) {
            this.imgPath = imgPath;
        }
    }

    public Goods(Integer id, String name, BigDecimal price, Integer sales, Integer stock, String imgPath, Integer category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
        if(imgPath!=null&&!"".equals(imgPath)) {
            this.imgPath = imgPath;
        }
        this.category = category;
    }

    public Goods() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        if(imgPath!=null&&!"".equals(imgPath)) {
            this.imgPath = imgPath;
        }
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", stock=" + stock +
                ", imgPath='" + imgPath + '\'' +
                ", category=" + category +
                '}';
    }
}
