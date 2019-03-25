package hu.ninetyone.repositories.Products;

import hu.ninetyone.entities.Products.Kitchen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KitchenRepository extends CrudRepository<Kitchen, Integer> {
    Optional<Kitchen> findByStocknumber(Integer stockNumber);
}

