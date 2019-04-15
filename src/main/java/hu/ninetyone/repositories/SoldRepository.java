package hu.ninetyone.repositories;

import hu.ninetyone.entities.Sold;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SoldRepository  extends CrudRepository<Sold, Integer> {
   List<Sold> findAllByRate(Integer rate);
}
