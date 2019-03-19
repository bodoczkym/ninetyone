package hu.ninetyone.repositories.Products;

import hu.ninetyone.entities.Products.Livingroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivingroomRepository extends CrudRepository<Livingroom, Integer> {
}

