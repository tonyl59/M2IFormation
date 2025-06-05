package org.example.Exercises.exo1;

import org.example.Demos.Demo1.entity.Personne;
import org.example.Exercises.exo1.dao.ProductDao;
import org.example.Exercises.exo1.entity.Product;
import org.example.Exercises.exo1.util.SessionFactorySingleton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class test {
    public static void main(String[] args) throws ParseException {

        ProductDao productDao = new ProductDao();
        Scanner scanner = new Scanner(System.in);

        Product product1 = Product.builder().name("coffee").brand("Nestlé").reference("N01").purchase_date(LocalDate.now()).price(5).stock(5).build();
        Product product2 = Product.builder().name("bed").brand("Ikea").reference("I01").purchase_date(LocalDate.now()).price(99.99).stock(1).build();
        Product product3 = Product.builder().name("vegan steak").brand("Nestlé").reference("N02").purchase_date(LocalDate.now()).price(10).stock(2).build();
        Product product4 = Product.builder().name("bed").brand("Decathlon").reference("A01").purchase_date(LocalDate.now()).price(120).stock(1).build();
        Product product5 = Product.builder().name("gameboy").brand("Nintendo").reference("NN33").purchase_date(LocalDate.now()).price(90).stock(1).build();

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        productDao.save(product5);

        System.out.println(productDao.get(2));

        Product productFound1 = productDao.get(3);
        productDao.delete(productFound1);

        Product productFound2 = productDao.get(1);
        productFound2.setName("Tea");
        productFound2.setPrice(4.5);
        productDao.save(productFound2);

        // Exo2 : afficher toutl es produits, afficher les produits depuis unu minimum de prix & afficher liste des produits entre 2 dates
        System.out.println("list of all products" + productDao.get()); // Affichage de tout les produits
        System.out.println("list by min price: " + productDao.get_by_price_min(100.)); // Affichage depuis un prix minimum

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date pre_date_product6 = formatter.parse("12-06-2025");
        LocalDate date_product6 = pre_date_product6.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        Product product6 = Product.builder().name("Nintendo 3DS").brand("Nintendo").reference("NN66").purchase_date(date_product6).price(200).stock(1).build();
        productDao.save(product6);
    }




/*

        System.out.println("enter the minimum date (dd/mm/yyyy)");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("enter the maximum date (dd/mm/yyyy)");
        LocalDate date2 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Une autre technique etait d'utiliser Date formatter.parse plus toinstantatzone etc... mais moins pratique ?
        //Date pre_date1 = formatter.parse("02-06-2025");
        //Date pre_date2 = formatter.parse("10-06-2025");
        //LocalDate date1 = pre_date1.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        //LocalDate date2 = pre_date2.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        System.out.println("list of product between selected dates"+productDao.get_between_dates(date1,date2));

        // Exercice 3 Partie1 => Afficher liste produits commandés entre 2 dates lus au clavier (deja fait au dessus) & retourner numero/ref des articule dont stock inferieur à une valeur
        System.out.println("list of product below selected stock number");
        List<Object[]> list1 = productDao.get_by_below_stock_max(3);// Resultat incomprehensible avec les limites du tostring
        for (Object[] obj : list1) {
            System.out.println("ID"+obj[0]+" "+obj[1]+" ");
        }

        // Exercice 3 Partie2

        // Afficher valeur du stock des produits d'une marque choisie
        System.out.println("total stock by selected brand: ");
        List<Object[]> list2 = productDao.get_stock_by_brand("Nintendo");
        for (Object[] obj : list2) {
            System.out.println("Stock: "+obj[0]+", Product: "+obj[1]+" ");
        }
        // Calculer prix moyen des produits
        System.out.println("price mean of all products : "+productDao.PriceMean());
        // Recuperer liste des produits d'une marque choisie
        System.out.println("product list of selected brand : "+productDao.get_by_brand("Nintendo"));
        System.out.println("product list of selected brand : "+productDao.get_by_brand("Naan"));
        // Supprimer les produits d'une marque choisie de la table produit
               //productDao.delete_by_brand("Nintendo");
    } */

}
