package com.quinbay.demo.service;
import java.util.*;
import java.io.*;

import com.quinbay.demo.controller.AdminController;
import com.quinbay.demo.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductManager implements AdminController {
    public static ArrayList<Product> product =new ArrayList();

    @Override
    public void load(){
        String file="/users/abinesh/csv/products.csv";


    }

}
