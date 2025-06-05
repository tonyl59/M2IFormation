package org.example.Exercises.exo1.util;


import org.example.Exercises.exo1.entity.Product;
import org.example.Exercises.exo1.service.ProductService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class IHM_get {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService service = new ProductService();

    public static void start(){
        int input = 0;
        System.out.println("\n==== What do you want to display====");
        while (input!=9) {
            System.out.println("\n1. Display a product by its id"); // create
            System.out.println("2. Display all products"); //all get_by
            System.out.println("3. Display all products of a brand");
            System.out.println("4. Display all products with price higher than a selected number");
            System.out.println("5. Display product ID & Reference with a quantity lower than a selected number");
            System.out.println("6. Display all products between a date range");
            System.out.println("7. Display average price of all products");
            System.out.println("8. Get all the quantities of each product of a brand");
            System.out.println("9. Go back to main menu\n");
            System.out.print("Your choice : ");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1 -> get_by_id();
                case 2 -> get_all_product();
                case 3 -> get_by_brand();
                case 4 -> get_by_price_min();
                case 5 -> get_by_quantity_max();
                case 6 -> get_between_dates();
                case 7 -> get_average_price();
                case 8 -> get_qty_by_brand();
                case 9 -> System.out.println("Going back to main menu.");
                default -> System.out.println("Invalid input");
            }
        }
    }
    private static void get_by_id(){
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Product product = service.getProduct(id);

        if (product==null) {
            System.out.println("Product ID not found");
            return;
        }
        System.out.println(service.getProduct(id));

    }

    private static void get_all_product(){
        System.out.println("List of all products: ");
        for (Product product : service.getAllProducts()) {
            System.out.println(product);
        }
    }

    private static void get_by_brand(){
        System.out.println("Enter brand of all products you want to display: ");
        String brand = scanner.nextLine();
        List<Product> products = service.get_all_by_brand(brand);
        if (products.isEmpty()) {
            System.out.println("Brand not found");
            return;
        }else{
            for (Product product : products) {
                System.out.println(product);
            }
        }

    }
    private static void get_by_price_min(){
        System.out.println("Enter the minimum price that you want products with price over it to display: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        List<Product> products =  service.getByPriceMin(price);
        if (products.isEmpty()) {
            System.out.println("Brand not found");
            return;
        }else{
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private static void get_by_quantity_max(){
        System.out.println("Enter the maximum quantity that you want products with quantity below it to display: ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        while (qty<0) {
            System.out.println("Please enter a number over 0 ");
            qty = scanner.nextInt();
            scanner.nextLine();
        }
        List<Object[]> objects = service.get_by_below_stock_max(qty);
        if (objects.isEmpty()) {
            System.out.println("No products found");
            return;
        }else{
            for (Object[] object : objects) {
                System.out.println("[ID"+object[0]+"]: reference "+object[1]);
            }
        }

    }

    private static void get_between_dates(){
        System.out.println("enter the minimum date (dd/mm/yyyy)");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("enter the maximum date (dd/mm/yyyy)");
        LocalDate date2 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        List<Product> products = service.getBetweenDates(date1, date2);
        if (products.isEmpty()) {
            System.out.println("No products found");
            return;
        }else{
            System.out.println("list of product between selected dates: ");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private static void get_average_price(){
        System.out.println(service.get_price_mean());

    }

    private static void get_qty_by_brand(){
        System.out.println("Enter brand to display its products and quantity");
        String brand = scanner.nextLine();
        List<Object[]> objects = service.get_stock_by_brand(brand);
        if (objects.isEmpty()) {
            System.out.println("Brand not found");
            return;
        }
        for (Object[] object : objects) {
            System.out.println("["+object[1]+"] "+object[0]);
        }
    }



}
/*
        System.out.println("enter the minimum date (dd/mm/yyyy)");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("enter the maximum date (dd/mm/yyyy)");
        LocalDate date2 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
 */