package by.geekbrains.surf.controller;

import by.geekbrains.surf.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @Autowired
    ProductTypeRepository productTypeRepository;


    @GetMapping("/")
    public  String index (Model model){
        productTypeRepository.findAll();
return "index";
    }

}
