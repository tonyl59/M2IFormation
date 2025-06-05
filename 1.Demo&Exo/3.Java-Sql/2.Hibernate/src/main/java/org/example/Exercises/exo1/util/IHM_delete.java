package org.example.Exercises.exo1.util;

import org.example.Exercises.exo1.entity.Product;
import org.example.Exercises.exo1.service.ProductService;

import java.sql.SQLException;
import java.util.Scanner;

public class IHM_delete {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService service = new ProductService();

    public static void start(){
        int input = 0;
        System.out.println("\n==== How do you want to delete product ====\n");
        while (input!=3) {
            System.out.println("1. Delete a product by its id"); // create
            System.out.println("2. Delete all products from a brand"); //all get_by
            System.out.println("3. Go back to main menu\n");
            System.out.print("Your choice : ");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> delete_by_id();
                case 2 -> delete_by_brand();
                case 3 -> System.out.println("Going back to main menu.");
                default -> System.out.println("Invalid input");
            }
        }
    }
    public static void delete_by_id() {
        System.out.println("Please input id of product you want to delete");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = service.getProduct(id);
        if (product == null){
            System.out.println("Product ID not found!");
            return;
        }else{
            service.deleteProduct(product);
            System.out.println("Product deleted successfully !");
        }
    }

    public static void delete_by_brand(){
        System.out.println("Please input brand of all products you want to delete");
        String brand = scanner.nextLine();

        if (service.get_all_by_brand(brand).isEmpty()){
            System.out.println("Brand not found!");
        }else{
            service.deleteAllByBrand(brand);
            System.out.println("Product deleted successfully !");
        }
    }
}
