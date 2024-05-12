package client;

import Entity.Product;
import dto.ProductDto;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class IventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. add poduct");
        System.out.println("2. Display all product");
        System.out.println("3. Notify low product");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                createProduct(scanner);
                break;
            case 2:
            displayAllProduct();
            break;
            case 3:
                notifyLowStock();
                break;
        }


    }

    private static void notifyLowStock() {
        ProductService productService = new ProductServiceImpl();
        List<Product> productList = productService.notifyLowStock();

        for (Product product: productList) {
            System.out.println(product);
        }
    }

    private static void displayAllProduct() {
        ProductService productService = new ProductServiceImpl();
        List<Product> productList = productService.displayAll();

        for (Product product: productList) {
            System.out.println(product);
        }
    }

    private static void createProduct(Scanner scanner){

        System.out.println("Ju lutem fusni te dhenat e produktit");
        System.out.println("Ju lutem fusni modelin e produktit");
        String model = scanner.next();
        System.out.println("ju lutem fusni pershkrimin e produktit");
        String description = scanner.next();
        System.out.println("ju lutem fusni cmimin e produktit");
        Double price = scanner.nextDouble();
        System.out.println("ju lutem fusni sasin e produktit");
        Integer quantity = scanner.nextInt();


        ProductDto productDto = new ProductDto();
        productDto.setDescription(description);
        productDto.setModel(model);
        productDto.setPrice(price);
        productDto.setQuantity(quantity);

        ProductService productService = new ProductServiceImpl();
        productService.createProduct(productDto);
    }


}
