package org.example;

import org.example.exception.NotFoundException;

public class Shop {
    private Product product;

    public Product update(Product product){

        int speed = 1; // degradation speed

        if (product.getSellin() != 0){
            product.setSellin(product.getSellin()-1);
        }
        if (product.getSellin() ==0){
            speed = 2;
        }


        if (product.getName().equalsIgnoreCase("Aged Brie")){
            product.setQuality(product.getQuality()+1);

        }else{
            if(product.getType().equalsIgnoreCase("Dairy")){
                product.setQuality(product.getQuality()-2*speed);
            }else{
                product.setQuality(product.getQuality()-1*speed);
            }
        }
        if (product.getQuality() > 50){
            throw new NotFoundException("Product quality cannot be higher than 50 !");
        }
        if (product.getQuality() < 0){
            throw new NotFoundException("Product quality cannot be lower than 0 !");

        }
        return product;
    }
}





