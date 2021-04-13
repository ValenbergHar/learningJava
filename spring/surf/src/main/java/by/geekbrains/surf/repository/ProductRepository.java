package by.geekbrains.surf.repository;

import by.geekbrains.surf.entity.Product;
import by.geekbrains.surf.entity.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    public List<Product> findByProductType(ProductType productType);
}
