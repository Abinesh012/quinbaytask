package com.quinbay.demo.model;

import org.springframework.stereotype.Service;

@Service
public class EmployeeSalary {
    int id1=101;
    public int display(int id){
        if(id1==id){
            return 10000;
        }
        return 0;
    }
}
