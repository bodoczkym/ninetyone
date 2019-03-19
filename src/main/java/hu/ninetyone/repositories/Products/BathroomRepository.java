package hu.ninetyone.repositories.Products;

import hu.ninetyone.entities.Products.Bathroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BathroomRepository extends CrudRepository<Bathroom, Integer> {
}
