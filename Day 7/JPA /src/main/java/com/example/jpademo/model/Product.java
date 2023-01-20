package com.example.jpademo.model;
import javax.persistence.*;
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name="product_id")
    int product_id;
    @Column(name="product_name")
    String product_name;
    @Column(name="product_price")
    long price;
    @Column (name="product_gst")
    double gst;

    public Product(int id, int pid, String product_name, long price, double gst) {
        this.id = id;
        this.product_id = pid;
        this.product_name = product_name;
        this.price = price;
        this.gst = gst;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return product_id;
    }

    public void setPid(int pid) {
        this.product_id = pid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

}
