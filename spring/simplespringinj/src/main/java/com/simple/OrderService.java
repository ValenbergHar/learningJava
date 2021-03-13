package com.simple;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public  void  createOrder(){
        System.out.println("Order is created");
    }
}
