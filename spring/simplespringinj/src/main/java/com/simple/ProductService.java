package com.simple;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    public void getProducts(){
        System.out.println("Products are received");
    }
}
