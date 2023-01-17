package com.quinbay.demo.controller;


import com.quinbay.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.quinbay.demo.model.Product;


//
//public class HelloWorldController {
//    @GetMapping("/fetch/{employeeId}")
//    public String index(@RequestParam String name, @RequestParam("location") String locationValue, @PathVariable String employeeId){
//        return "Welcome "+name+" "+locationValue+" "+employeeId;
//    }
//
//    @PostMapping("/save")
//    public String posData(@RequestBody EmployeeRequest employeeRequest){
//        return "Employee Name: "+employeeRequest.getName()+"\nEmployee ID: "+employeeRequest.getEmployee_id()+"\nEmployee Location :"+employeeRequest.getLocation()+"\nEmployee Phone :"+employeeRequest.getPhone();
//    }
//
//@RequestMapping(value = "/employee")
//@RestController
////public class HelloWorldController{
////    @Autowired
////    SumOfTwo sum;
////        @GetMapping("/{a}/{b}")
////        public int add(@PathVariable int a,@PathVariable int b){
////            //SumOfTwo obj=new SumOfTwo();
////            int c=sum.add(a,b);
////            System.out.println("VAlue of c is "+c);
////            return c;
////    }
////}
//public class HelloWorldController{
//    @Autowired
//    EmployeeSalary emp;
//    @GetMapping("/{id}")
//    public int display(@PathVariable int id){
//        int salary=emp.display(id);
//        System.out.println("Salary is "+salary);
//        return salary;
//    }
@RestController
@RequestMapping value=("/")

public class HelloWorldController{
@Autowired
    Product product;
@GetMapping("/getProduct/{a}")
    public Product add(@PathVariable int a){
    product.load();
    return product.displayProduct(a);
}
@PostMapping("/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public Product.addProduct(@RequestBody Product a){
    return product.addProduct(a);
    }


}
