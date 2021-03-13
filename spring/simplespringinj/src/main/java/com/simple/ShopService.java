package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopService {
    @Autowired
    private MailService mailService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;


    public void buy() {
        productService.getProducts();
        orderService.createOrder();
        mailService.sendMail();

    }
}
