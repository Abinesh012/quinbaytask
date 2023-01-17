package com.quinbay.demo.model;

import java.util.*;
public class Retailer {
    int w_id;

    String w_name;

    public Retailer(int w_id, String w_name) {
        this.w_id = w_id;
        this.w_name = w_name;
        Product p1=new Product(101,"TV",100,10000,18);
        Product p2=new Product(102,"Fan",100,5000,17);
        w_productList.add(p1);
        w_productList.add(p2);



    }

    List<Product> w_productList=new ArrayList();
    Retailer(){}

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    public List <Product> getW_productList() {
        return w_productList;
    }

    public void setW_productList(List <Product> w_productList) {
        this.w_productList = w_productList;
    }


}
