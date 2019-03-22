package hu.ninetyone.repositories.Products;

import hu.ninetyone.entities.Products.Bedroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BedroomRepository extends CrudRepository<Bedroom, Integer> {
    Optional<Bedroom> findByStocknumber(Integer stockNumber);
}

