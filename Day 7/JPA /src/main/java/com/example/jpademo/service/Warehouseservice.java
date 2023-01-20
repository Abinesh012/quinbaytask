package com.example.jpademo.service;

import com.example.jpademo.interfaces.Warehouseinterface;
import com.example.jpademo.interfaces.Warehouserepository;
import com.example.jpademo.model.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Warehouseservice implements Warehouseinterface {


    @Autowired
    Warehouserepository warehouserepository;


    @Override
    public List<Warehouse> getAllWarehouses(){
        return warehouserepository.findAll();
    }

    @Override
    public Optional <Warehouse> getWarehouseByID(int id) {
        return warehouserepository.findById(id);
    }

    public Warehouse addWarehouse(Warehouse temp){
        return warehouserepository.save(temp);
    }
    public String deleteWarehouse(int id){
        try{
            warehouserepository.deleteById(id);
            return ("Deleted Successfully");
        }catch (Exception e){
            return("Nothing Happened");
        }
    }
//
//    @Override
//    public Optional updateWarehouse(int id) {
//
//        warehouserepository.set(quantity);
//        warehouserepository.setPrice(price);
//        warehouserepository.save(warehouseInventory);
//        return Optional.empty();
//    }
}
