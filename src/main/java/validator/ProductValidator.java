package validator;

import dto.ProductDto;

public class ProductValidator {

    public static void valiatorProduct(ProductDto productDto){
        if (productDto.getModel().isBlank()){
            throw new IllegalArgumentException("Ju lutem modeli" +
                    "i product eshte i nevojshem");


        }

        if (productDto.getPrice()<= 0D){
            throw new IllegalArgumentException("Ju lutem cmimi" +
                    "i produktit smund te jete 0 ose me vlera" + "negative" );
        }

    }
}
