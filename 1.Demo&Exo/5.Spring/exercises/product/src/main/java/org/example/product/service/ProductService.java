package org.example.product.service;

import org.example.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private final Map<Integer, Product> products;


    public ProductService(){
        products = new HashMap<>();

        Product product1 = Product.builder()
                .id(1).name("PS5 Lite").category("Console").price(549).build();
        Product product2 = Product.builder()
                .id(2).name("PS5").category("Console").price(461.99).build();
        Product product3 = Product.builder()
                .id(3).name("Shirt").category("Clothes").price(35).build();
        Product product4 = Product.builder()
                .id(4).name("Switch").category("Console").price(299.9).build();
        Product product5 = Product.builder()
                .id(5).name("XBOX").category("Console").price(99.9).build();
        Product product6 = Product.builder()
                .id(6).name("Socks").category("Clothes").price(4.9).build();
        this.products.put(product1.getId(), product1);
        this.products.put(product2.getId(), product2);
        this.products.put(product3.getId(), product3);
        this.products.put(product4.getId(), product4);
        this.products.put(product5.getId(), product5);
        this.products.put(product6.getId(), product6);

    }

    public List<Product> getProducts(){return this.products.values().stream().toList();}

    public Set<String> getCategories(){
        Set<String> categories = new HashSet<>();
        for (Product p : products.values()){
            categories.add(p.getCategory());
        }
        return categories;

    }
    public Product getByID(int id){return this.products.get(id);}

    public List<Product> getByName(String name) {
        List<Product> productlist = new ArrayList<>();
        for (Product p : products.values()) {
            if (p.getName().equals(name)) {
                productlist.add(p);
            }
        }
        return productlist;
    }

    public List<Product> getByCategory(String category) {
        List<Product> productlist = new ArrayList<>();
        for (Product p : products.values()) {
            if (p.getCategory().equals(category)) {
                productlist.add(p);
            }

        }
        return productlist;
    }

}


