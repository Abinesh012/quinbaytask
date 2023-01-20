package com.example.jpademo.controller;


import com.example.jpademo.interfaces.Warehouseinterface;
import com.example.jpademo.model.Warehouse;
import com.example.jpademo.service.Warehouseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.jpademo.model.Warehouse;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MainController {
    Warehouse warehouse =new Warehouse();

    @Autowired
    Warehouseinterface warehouseinterface;

    @GetMapping("/warehouses")
    public List<Warehouse> getAllWarehouses(){
        return warehouseinterface.getAllWarehouses();
    }

    @GetMapping("/warehouses/{id}")
    public Optional <Warehouse> getWarehouseByID(int id) {
        return warehouseinterface.getWarehouseByID(id);
    }

    @PostMapping("/addWarehouse")
    public Warehouse addWarehouse(@RequestBody Warehouse warehouse){
        return warehouseinterface.addWarehouse(warehouse);
    }

    @DeleteMapping("/deleteWarehouse/{id}")
    public String deleteWarehouse(@RequestParam int id){
        return warehouseinterface.deleteWarehouse(id);
    }

//    @PutMapping("/updateWarehouse/{id}"){
//        public Optional <Warehouse> updateWarehouse(@RequestParam int id){
//            return warehouseinterface.updateWarehouse(id);
//        }
//    }

//
//    @GetMapping("/warehouses/{id}")
//    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable(value ="id")Integer warehouseId){
//        Warehouse warehouse= warehouseinterface.findById(warehouseId)
//                .orElse(w);
//
//        return ResponseEntity.ok().body(warehouse);
//    }
//
//    @PostMapping("/addWarehouse")
//    public Warehouse addWarehouse(@Valid @RequestBody Warehouse warehouse){
//        return warehouseinterface.save(warehouse);
//    }

}
