package hu.ninetyone.repositories;

import hu.ninetyone.entities.Purchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    List<Purchase> findAllByUser(Integer integer);
}
