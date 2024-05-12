package converter;

import Entity.Product;
import dto.ProductDto;

public class ProductConverter {
    public static Product convertToEntity(ProductDto productDto){
        Product product = new Product();
        product.setModel(productDto.getModel());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());

        return product;
    }
}
