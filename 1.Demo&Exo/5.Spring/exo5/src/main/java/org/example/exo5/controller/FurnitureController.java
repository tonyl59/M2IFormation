package org.example.exo5.controller;

import org.example.exo5.entity.Furniture;
import org.example.exo5.service.FurnitureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FurnitureController {
    private final FurnitureService furnitureService;

    public FurnitureController(FurnitureService furnitureService){
        this.furnitureService = furnitureService;
    }
    @GetMapping("/")
    public String homePage(){return "homepage";}


    @GetMapping("/furnitures")
    public String list(Model model){
        model.addAttribute("furnitures", furnitureService.getAllFurniture());
        return "furnituresPage";
    }

    @GetMapping("/furnitures/detail/{id}")
    public String detail(@PathVariable("id") Long id, Model model){
        Furniture furniture = furnitureService.getFurnitureById(id);
        model.addAttribute(furniture);
        return "detailpage";
    }

    @GetMapping("/createfurniture")
    public String addFurniture(Model model){
        model.addAttribute("furniture", new Furniture());
        return "createPage";
    }
    @PostMapping("/createfurniture")
    public String submitFurniture(@ModelAttribute("furniture") Furniture furniture){
        furnitureService.saveFurniture(furniture);
        return "redirect:/createfurniture";
    }



}

