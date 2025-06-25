package org.example.exo3.service;

import lombok.Getter;
import lombok.Setter;
import org.example.exo3.dto.ProductReceiveDto;
import org.example.exo3.dto.ProductResponseDto;
import org.example.exo3.entity.Product;
import org.example.exo3.exception.NotFoundException;
import org.example.exo3.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Getter
@Setter
public class CartService {

    Map<Long, Integer> cart = new HashMap<>();
    ProductRepository productRepository;

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void add_to_cart (long productId, int qty){
        productRepository.findById(productId).orElseThrow(NotFoundException::new);
            this.cart.put(productId, this.cart.get(productId) + qty);
        }



    public void remove_from_cart (long productId, int qty){
        productRepository.findById(productId).orElseThrow(NotFoundException::new);
        int product_qty = this.cart.get(productId);
        int new_product_qty = product_qty - qty;
        if (new_product_qty <0){
            this.cart.remove(productId);
        }else{
            this.cart.put(productId, new_product_qty);
        }
    }

    public List<ProductResponseDto>  confirm_cart(){
        List<ProductResponseDto> products = new ArrayList<>();
        for (long id : cart.values()){
            ProductResponseDto product = productRepository.findById(id).orElseThrow().entityToDto();
            products.add(product);
        }
        return products;
    }
}