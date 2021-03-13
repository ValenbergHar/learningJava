package com.item;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = new ArrayList<Product>();
        for (int i = 0; i < 10; i++) {
            productList.add(new Product(new Long(i + 1), "product #" + i, 10 * i));

        }
    }

    public void printAll() {
        for (Product p : productList) {
            System.out.println(p.getId() + " " + p.getTitle() + " " + p.getCost());
        }
    }

    public Product findByTitle(final String title) {
        return productList.stream().filter(p -> p.getTitle().equals(title)).findFirst().get();
    }
}
