package service;

import Entity.Product;
import dto.ProductDto;

import java.util.List;

public interface ProductService {
    void createProduct(ProductDto productDto);

    List<Product> displayAll();

    List<Product> notifyLowStock();
}
