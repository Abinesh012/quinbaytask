package com.quinbay.server1.service;

import com.quinbay.server1.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    public static ArrayList<Product> product = new ArrayList<>();
    public Product disp_product(int id) {
        Product ans=null;
        for (Product prod : product) {
            if (prod.id == id) {
                ans=prod;
            }
        }return ans;
    }
    public Product add_product(Product add_prod) {
        product.add(add_prod);
        return add_prod;
    }
    public void mang_warehouse(int id,int val){
        for(Product prod: product) {
            if(prod.id == id) {
                prod.stock = prod.stock - val;
            }
        }
    }
    public void remove_prod(int id){
        for(Product prod: product) {
            if(prod.id == id) {
                product.remove(prod);
            }
        }
    }
}
