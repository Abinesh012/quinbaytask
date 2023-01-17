package com.quinbay.demo.model;

import java.util.*;

public class Wholeseller {
    int w_id;

    public Wholeseller(int w_id, List <Product> wholesellerProducts, String w_name) {
        this.w_id = w_id;
        this.wholesellerProducts = wholesellerProducts;
        W_name = w_name;
    }

    List<Product> wholesellerProducts=new ArrayList();
    String W_name;


    public List <Product> getWholesellerProducts() {
        return wholesellerProducts;
    }

    public void setWholesellerProducts(List <Product> wholesellerProducts) {
        this.wholesellerProducts = wholesellerProducts;
    }


    Wholeseller(){}

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public String getW_name() {
        return W_name;
    }

    public void setW_name(String w_name) {
        W_name = w_name;
    }
    Wholeseller(int id,String name){
        this.w_id=id;
        this.W_name=name;
        this.wholesellerProducts=new ArrayList <Product>();
        Product p1=new Product(1001,"TV",100,10000,18);
        Product p2=new Product(1002,"Fan",100,10000,18);
        wholesellerProducts.add(p1);
        wholesellerProducts.add(p2);


    }
    public WholeSelller disp_wholesaler(int id) {
        Wholeseller ans = null;
        for (Wholeseller temp_whole : wholesellerProducts) {
            if (temp_whole.w_id == id) {
                ans = temp_whole;
            }
        }
        return ans;
    }

    public Whole add_wholesaler(Wholesaler add_whole) {
        wholesaler.add(add_whole);
        return add_whole;
    }



}
