package ru.loshmanov.geekbrains.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.loshmanov.geekbrains.entity.Product;
import ru.loshmanov.geekbrains.entity.ProductType;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> findByProductType(ProductType productType);

}
