package hu.ninetyone.repositories.Products;

import hu.ninetyone.entities.Products.Livingroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivingroomRepository extends CrudRepository<Livingroom, Integer> {
    Optional<Livingroom> findByStocknumber(Integer stockNumber);
}

