package org.example.exo5.controller;

import org.example.exo5.entity.CartItem;
import org.example.exo5.service.CartItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartItemController {
    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService){
        this.cartItemService = cartItemService;
    }

    @GetMapping("/cartitems")
    public String list(Model model){
        model.addAttribute("CartItems", cartItemService.getAllCartItems());
        return "cartPage";
    }

    @GetMapping("/addcart")
    public String addtocart(Model model){
        model.addAttribute("CartItem", new CartItem());
        return "createPage";
    }
    @PostMapping("/addcart")
    public String submitCartItem(@ModelAttribute("CartItem") CartItem cartItem){
        cartItemService.addToCart(cartItem);
        return "redirect:/addcart";
    }
}
