package hu.ninetyone.repositories;

import hu.ninetyone.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    //List<Product> findAllByProductname(String... s);
    //List<Product> findAllByCategoryId(Integer i);
}
