package com.example.jpademo.interfaces;

import com.example.jpademo.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Warehouseinterface  {
    List<Warehouse> getAllWarehouses();
    Optional <Warehouse> getWarehouseByID(int id);
    Warehouse addWarehouse(Warehouse warehouse);
    String deleteWarehouse(int id);


//    Optional updateWarehouse(int id);
}
