package org.example.exo3.controller;

import jakarta.servlet.http.HttpSession;
import org.example.exo3.dto.CartResponseDto;
import org.example.exo3.dto.ProductResponseDto;
import org.example.exo3.entity.Product;
import org.example.exo3.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/session")
public class SessionController {

    private CartService service;



    public SessionController(CartService service) {
        this.service = service;

    }

    @GetMapping("/add/{id}&{qty}")
    public ResponseEntity<String> addToCart (@PathVariable long id,  @PathVariable int qty){
        service.add_to_cart(id, qty);
       // session.setAttribute("cart",service.getCart());
        return ResponseEntity.ok("Product added to cart");
    }

    @GetMapping("/delete/{id}&{qty}")
    public ResponseEntity<String> removeFromCart (@PathVariable Long id,  @PathVariable Integer qty){
        service.remove_from_cart(id, qty);
      //  session.setAttribute("cart",service.getCart());
        return ResponseEntity.ok("Product(s) deleted from cart");
    }


    @GetMapping("/confirm")
    public ResponseEntity<CartResponseDto> getProducts (){
        return ResponseEntity.ok(service.confirm_cart());

    }

}

