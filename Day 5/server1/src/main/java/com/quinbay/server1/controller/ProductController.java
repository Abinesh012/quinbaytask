package com.quinbay.server1.controller;

import com.quinbay.server1.model.Product;
import com.quinbay.server1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService product;

    @GetMapping("/getProduct")
    public Product get_prod(@RequestParam int a) {
        return product.disp_product(a);
    }

    @PostMapping("/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public Product add_prod(@RequestBody Product a) {
        return product.add_product(a);
    }

    @PutMapping("/updateProduct")
    public String  update_prod(@RequestParam int id,@RequestParam int val) {
        product.mang_warehouse(id,val);
        return "Product updated successfully";
    }

    @DeleteMapping("/deleteProduct")
    public String delete_prod(@RequestParam int id) {
        product.remove_prod(id);
        return "Product deleted successfully";
    }

}
