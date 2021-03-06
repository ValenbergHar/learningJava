package com.example.demo.services;

import com.example.demo.enteties.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class ProductsService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getAllProductsWithFilter(String word) {

        List<Product> fullList = productRepository.findAll();
        if (word == null) return fullList;
        return fullList.stream().filter(p -> p.getTitle().contains(word)).collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public void add(Product product) {
        productRepository.save(product);
    }

    public void saveOrUpdate(Product product) {
        productRepository.save(product);
    }
}
