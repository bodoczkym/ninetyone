package hu.ninetyone.repositories.Products;

import hu.ninetyone.entities.Products.Techs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechsRepository extends CrudRepository<Techs, Integer> {
}

