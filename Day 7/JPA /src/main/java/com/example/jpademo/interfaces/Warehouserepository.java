package com.example.jpademo.interfaces;

import com.example.jpademo.model.Warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Warehouserepository extends JpaRepository<Warehouse,Integer> {

}
