package com.example.demo.controllers;

import com.example.demo.enteties.Product;
import com.example.demo.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public String showProductsList(Model model, @RequestParam(value="word", required = false)String word) {
        Product product = new Product();
        model.addAttribute("products", productsService.getAllProductsWithFilter(word));
        model.addAttribute("product", product);
        model.addAttribute("word", word);
        return "products";
    }

    @PostMapping("/edit")
    public String addProduct(@ModelAttribute(value = "product") Product product) {
        productsService.add(product);
        return "redirect:/products";
    }

    @GetMapping("/show/{id}")
    public String showOneProduct(Model model, @PathVariable(value = "id") Long id) {
        Product product = productsService.getById(id);
        model.addAttribute("product", product);
        return "product-page";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable(value = "id") Long id) {
        productsService.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/add")
    public String showAddProductForm(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-edit";
    }

    @GetMapping("/edit/{id}")
    public String showAddProductForm(Model model, @PathVariable(value = "id") Long id){
        Product product = productsService.getById(id);
        model.addAttribute("product", product);
        return "product-edit";
    }

}


