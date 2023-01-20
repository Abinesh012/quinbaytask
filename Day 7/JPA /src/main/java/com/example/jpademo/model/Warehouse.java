package com.example.jpademo.model;
import javax.persistence.*;
@Entity
@Table(name="warehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name="warehouse_id")
    int warehouse_id;

    @Column(name="warehouse_name")
    String warehouse_name;


    public Warehouse(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public Warehouse(int id, int warehouse_id, String warehouse_name) {
        this.id = id;
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
    }
}
