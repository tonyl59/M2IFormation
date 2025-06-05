package org.example.Exercises.exo1.util;

import org.example.Exercises.exo1.entity.Comment;
import org.example.Exercises.exo1.entity.Image;
import org.example.Exercises.exo1.entity.Product;
import org.example.Exercises.exo1.service.ProductService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class IHM_imageComment {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService service = new ProductService();

    public static void start(){
        int input = 0;
        System.out.println("\n==== Welcome to the image/comment manager, which actions do you want to do ? ====\n");
        while (input!=4) {
            System.out.println("1. Add an image to product");
            System.out.println("2. Add a comment to product");
            System.out.println("3. Display all products with an average score superior to a number");
            System.out.println("4. Go back to main menu\n");
            System.out.print("Your choice : ");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> add_image();
                case 2 -> add_comment();
                case 3 -> display_over_score();
                case 4 -> System.out.println("Going back to main menu.");
                default -> System.out.println("Invalid input");
            }
        }
    }
    public static void add_image(){
        System.out.println("Enter the product ID you want to associate image with");
        int productID = scanner.nextInt();
        scanner.nextLine();
        Product product = service.getProduct(productID);
        if (product==null) {
            System.out.println("Invalid product ID");
            return;
        }else {
            System.out.println("Enter the image url: ");
            String url = scanner.nextLine();
            Image image = Image.builder().url(url).product(product).build();
            service.createImage(image);
        }
    }
    public static void add_comment(){
        System.out.println("Enter the product ID you want to associate comment with");
        int productID = scanner.nextInt();
        scanner.nextLine();
        Product product = service.getProduct(productID);
        if (product==null) {
            System.out.println("Invalid product ID");
            return;
        }else{
            System.out.println("Enter the comment content: ");
            String content = scanner.nextLine();
            System.out.println("Enter the comment score: ");
            double score = scanner.nextDouble();
            Comment comment = Comment.builder().content(content).score(score).date(LocalDate.now()).product(product).build();
            service.createComment(comment);
        }
    }
    public static void display_over_score(){
        System.out.println("Enter minimum score you want the display products with a higher average score");
        double score = scanner.nextDouble();
        List<Product> products = service.get_all_product_over_score(score);
        if (products.isEmpty()) {
            System.out.println("No products found");
            return;
        }else{
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}
