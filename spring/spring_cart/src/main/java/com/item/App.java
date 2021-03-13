package com.item;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        Cart cart = context.getBean("cart", Cart.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);

        cart.add(productService.findByTitle("product #2"));
        cart.add(productService.findByTitle("product #7"));
        cart.add(productService.findByTitle("product #9"));

        orderService.createOrder();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
