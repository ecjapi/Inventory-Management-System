package service;

import Entity.Product;
import config.HibernateConfig;
import converter.ProductConverter;
import dao.ProductDao;
import dao.ProductDaoImpl;
import dto.ProductDto;
import org.hibernate.SessionFactory;
import validator.ProductValidator;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private final Integer quantity = 5;

    private final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

    @Override
    public void createProduct(ProductDto productDto) {
        ProductValidator.valiatorProduct(productDto);
        Product product = ProductConverter.convertToEntity(productDto);

        ProductDao productDao = new ProductDaoImpl(sessionFactory);
        productDao.save(product);
    }

    @Override
    public List<Product> displayAll() {
        ProductDao productDao = new ProductDaoImpl(sessionFactory);
        return productDao.findAll() ;
    }

    @Override
    public List<Product> notifyLowStock() {
        ProductDao productDao = new ProductDaoImpl(sessionFactory);
        return productDao.findLowProducts(quantity);
    }
}
