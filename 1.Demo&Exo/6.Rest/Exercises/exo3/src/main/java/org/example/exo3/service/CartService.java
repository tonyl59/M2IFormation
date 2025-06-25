package org.example.exo3.service;

import jakarta.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;
import org.example.exo3.dto.CartResponseDto;
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

    private HttpSession session;
    private ProductService productService;
    //private Map<Long, Integer> cart = (Map<Long,Integer>) session.getAttribute("cart");

    public CartService(ProductService productService, HttpSession session) {
        this.productService = productService;
        this.session = session;
    }

    public void add_to_cart (long productId, int qty){
        Map<Long,Integer> cart = (Map<Long,Integer>) session.getAttribute("cart");
        if(cart == null){
            cart = new HashMap<>();
        }
        productService.get(productId);
        if(cart.containsKey(productId)){
            cart.put(productId, cart.get(productId) + qty);
        }else{
            cart.put(productId, qty);
        }
        session.setAttribute("cart",cart);
    }



    public void remove_from_cart (long productId, int qty){
        Map<Long,Integer> cart = (Map<Long,Integer>) session.getAttribute("cart");
        productService.get(productId);

        int product_qty = cart.get(productId);
        int new_product_qty = product_qty - qty;
        if (new_product_qty <1){
            cart.remove(productId);
        }else{
            if(cart.containsKey(productId)){
                cart.put(productId, new_product_qty);
            } // comment mettre un message que l'objet n'est pas dans le cart ?
        }
        session.setAttribute("cart",cart);
    }

    public CartResponseDto  confirm_cart(){
        double totalPrice = 0;
        Map<Long,Integer> cart = (Map<Long,Integer>) session.getAttribute("cart");
        if(cart==null){
            return null;
        }
        Map<ProductResponseDto, Integer> products = new HashMap<>();
        for (Map.Entry<Long,Integer> entry : cart.entrySet()){
            ProductResponseDto product = productService.get(entry.getKey());
            products.put(product,entry.getValue());
            totalPrice += product.getPrice() * entry.getValue();
        }
        return CartResponseDto.builder().cart(products).totalPrice(totalPrice).build();
    }
}