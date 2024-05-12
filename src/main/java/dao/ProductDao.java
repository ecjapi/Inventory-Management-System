package dao;

import Entity.Product;

import java.util.List;

public interface ProductDao {

    void save(Product product);

    List<Product> findAll();

    List<Product> findLowProducts(Integer quantity);

}
