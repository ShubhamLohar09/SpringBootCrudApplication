package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProductController {

    @Autowired
    ProductService productServiceImpl;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Product product){
        productServiceImpl.saveData(product);
        return "Data Saved Successfully";
    }

    @GetMapping("/getdata")
    public List<Product> getAllData(){
       return productServiceImpl.getAllData();
    }

    @PutMapping("/updatedata/{prodId}")
    public String updateData(@PathVariable int prodId,@RequestBody Product product){

        productServiceImpl.updateData(prodId,product);
        return "Upadate Data Successfully";
    }

    @DeleteMapping("/deletedata/{prodId}")

    public String deleteData(@PathVariable int prodId){
        productServiceImpl.deleteData(prodId);
        return "DeleteData Successfully";
    }

}
