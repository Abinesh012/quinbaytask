package com.quinbay.demo.model;

import org.springframework.stereotype.Service;

@Service
public class SumOfTwo {
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
}
