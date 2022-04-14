package com.csi.service;

import com.csi.model.Product;

import java.util.List;

public interface ProductService {
    public void saveData(Product product);

    public List<Product> getAllData();

    public void updateData(int prodId,Product product);

    public void deleteData(int prodId);
}
