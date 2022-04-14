package com.csi.service;

import com.csi.dao.ProductDao;
import com.csi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDao productServiceImpl;
    @Override
    public void saveData(Product product) {
        productServiceImpl.saveData(product);
    }

    @Override
    public List<Product> getAllData() {

        return productServiceImpl.getAllData();
    }

    @Override
    public void updateData(int prodId, Product product) {
      productServiceImpl.updateData(prodId,product);
    }

    @Override
    public void deleteData(int prodId) {
       productServiceImpl.deleteData(prodId);
    }
}
