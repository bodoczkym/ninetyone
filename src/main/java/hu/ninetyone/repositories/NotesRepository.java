package hu.ninetyone.repositories;

import hu.ninetyone.entities.Notes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends CrudRepository<Notes, Integer> {


}
