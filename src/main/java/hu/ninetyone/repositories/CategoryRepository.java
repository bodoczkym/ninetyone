package hu.ninetyone.repositories;

import hu.ninetyone.entities.Category;
import hu.ninetyone.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    @OneToMany
    List<Product> categoryOfOrderedProduct = new ArrayList<>();
}
