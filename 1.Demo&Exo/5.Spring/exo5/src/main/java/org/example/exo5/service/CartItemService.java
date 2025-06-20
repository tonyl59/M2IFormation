package org.example.exo5.service;

import org.example.exo5.dao.CartItemRepository;

import org.example.exo5.entity.CartItem;


import java.util.List;

public class CartItemService {
    private final CartItemRepository cartItemRepository;

    public CartItemService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }


    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }


    public CartItem addToCart(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public void removeFromCart(Long id){
        cartItemRepository.deleteById(id);
    }

    public void clearCart(){
        cartItemRepository.deleteAll();
    }
}