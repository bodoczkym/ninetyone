package hu.ninetyone.repositories;

import hu.ninetyone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EnumType;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
   /* @Query("select u from User.Role where u.role in :roles")
    List<User> findByRole(@Param("roles") List<User.Role> roles);*/
    Optional<User> findByRole(User.Role role);
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);

}
