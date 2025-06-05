package org.example.Exercises.exo1.util;

import org.example.Exercises.exo1.entity.Product;
import org.example.Exercises.exo1.service.ProductService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class IHM_MAIN {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService service = new ProductService();

    public static void start(){
        int input = 0;
        System.out.println("\n==== Welcome to the product manager====");
        while (input!=6) {
            System.out.println("\n1. Create a product"); // create
            System.out.println("2. Check product information"); //all get_by
            System.out.println("3. Update a product information");
            System.out.println("4. Delete product");
            System.out.println("5. Manage products' images and/or comments");
            System.out.println("6. Leave program\n");

            System.out.print("Your choice : ");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> addProduct();
                case 2 -> IHM_get.start();
                case 3 -> update_product();
                case 4 -> IHM_delete.start();
                case 5 -> IHM_imageComment.start();
                case 6 -> System.out.println("Program shutting down, have a good day!");
                default -> System.out.println("Invalid input");
            }
        }
    }
    private static void addProduct() {
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter its brand");
        String brand = scanner.nextLine();
        System.out.println("Enter its reference");
        String reference = scanner.nextLine();
        System.out.println("Enter its price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter its quantity: ");
        int stock = scanner.nextInt();
        scanner.nextLine();
        Product product = Product.builder().name(name).brand(brand).reference(reference).price(price).stock(stock).purchase_date(LocalDate.now()).build();
        service.createProduct(product);
    }
    private static void update_product() {
        System.out.println("Enter product id");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = service.getProduct(id);

        System.out.println("Enter its new name: ");
        product.setName(scanner.nextLine());

        System.out.println("Enter its new brand");
        product.setBrand(scanner.nextLine());

        System.out.println("Enter its new reference");
        product.setReference(scanner.nextLine());

        System.out.println("Enter its new price: ");
        product.setPrice(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter its quantity: ");
        product.setStock(scanner.nextInt());
        scanner.nextLine();

        service.update(product);
    }
}