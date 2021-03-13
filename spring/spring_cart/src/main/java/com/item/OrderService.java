package com.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {

    @Autowired
    Cart cart;

    public void createOrder() {

        System.out.println("Your order");
        List<Product> productList = cart.getContainer();
        for (Product p : productList) {
            System.out.println(p.getTitle());
        }
        System.out.println(productList.stream().mapToInt(Product::getCost).sum());
    }
}
