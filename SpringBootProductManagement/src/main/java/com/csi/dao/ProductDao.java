package com.csi.dao;

import com.csi.model.Product;

import java.util.List;

public interface ProductDao {

    public void saveData(Product product);

     public  List <Product> getAllData();

     public void updateData(int prodId,Product product);

     public void deleteData(int prodId);
}