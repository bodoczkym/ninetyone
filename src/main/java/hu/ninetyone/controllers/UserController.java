package hu.ninetyone.controllers;

import hu.ninetyone.entities.User;
import hu.ninetyone.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<User>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

   /* @GetMapping("/role/{role}")
   /* public ResponseEntity<Iterable<User>> get(@PathVariable String role) {
        if(role.equals("owner")){
            Optional<User> user = userRepository.findByRole(User.Role.ROLE_OWNER);
            if (user.isPresent()) {
                return ResponseEntity.ok();
            } else {
                return ResponseEntity.notFound().build();
            }
        }
        else if(role.equals("user")){
            Optional<User> user = userRepository.findByRole(User.Role.ROLE_USER);
            if (user.isPresent()) {
                return ResponseEntity.ok(userRepository.findAll());
            } else {
                return ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.notFound().build();
    }
   public ResponseEntity<User> getRole(@PathVariable String role){
     /*  Iterable<User> user = userRepository.findAll();
       List<User> list = new ArrayList<>();

       for(User u : user){
           if(u){
               list.add(u);
           }
       }
    }*/

    @PostMapping("")
    public ResponseEntity<User> post(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User user) {
        Optional<User> optUser = userRepository.findById(id);
        if (optUser.isPresent()) {
            user.setId(id);
            return ResponseEntity.ok(userRepository.save(user));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> delete(@PathVariable Integer id) {
        Optional<User> optUser = userRepository.findById(id);
        if (optUser.isPresent()) {
            userRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
