package hu.ninetyone.repositories.Products;

import hu.ninetyone.entities.Products.Kitchen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenRepository extends CrudRepository<Kitchen, Integer> {
}

