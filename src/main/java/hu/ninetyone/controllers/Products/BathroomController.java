package hu.ninetyone.controllers.Products;

import hu.ninetyone.entities.Products.Bathroom;
import hu.ninetyone.repositories.CategoryRepository;
import hu.ninetyone.repositories.ProductRepository;
import hu.ninetyone.repositories.Products.BathroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/bathroom")
public class BathroomController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BathroomRepository bathroomRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Bathroom>> getAll() {
        return ResponseEntity.ok(bathroomRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bathroom> getById(@PathVariable Integer id) {
        /*Optional<Bedroom> bedroom = bedroomRepository.findByStocknumber(stocknumber);
        if (bedroom.isPresent()) {
            return ResponseEntity.ok(bedroom.get());
        } else {
            return ResponseEntity.notFound().build();
        }*/
        Optional<Bathroom> bedroom = bathroomRepository.findById(id);
        if (bedroom.isPresent()) {
            return ResponseEntity.ok(bedroom.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //A kategóriát kiválasztva listázódnak a tételek (név és ár kíséretében),
    //amelyek szűrhetőek név(részlet)re
   /* @GetMapping("/{id}/products")
    public ResponseEntity<List<Product>> getProductOfGivenCategory(
            @PathVariable Integer id, String passage) {
        Optional<Category> category = categoryRepository.findById(id);
        List<Product> product = productRepository.findAllByCategoryId(id);
        if (!product.isEmpty()) {
            //if(passage.length() > 0 &&
           //         productRepository.findAllByProductname().contains(passage)){
          //      return ResponseEntity.ok(productRepository.findAllByProductname(passage));
         //   }
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

    @PostMapping("")
    public ResponseEntity<Bathroom> post(@RequestBody Bathroom bathroom) {
        Bathroom savedBath = bathroomRepository.save(bathroom);
        return ResponseEntity.ok(savedBath);
    }

    @PutMapping("/{stocknumber}")
    public ResponseEntity<Bathroom> update(@PathVariable Integer stocknumber,
                                           @RequestBody Bathroom bathroom) {
        Optional<Bathroom> optBathroom = bathroomRepository.findByStocknumber(stocknumber);
        if (optBathroom.isPresent()) {
            bathroom.setCategory(bathroom.getCategory());
            bathroom.setCreated_at(bathroom.getCreated_at());
            bathroom.setUpdated_at(bathroom.getUpdated_at());
            return ResponseEntity.ok(bathroomRepository.save(bathroom));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bathroom> delete(@PathVariable Integer id) {
        Optional<Bathroom> isPresent = bathroomRepository.findById(id);
        if (isPresent.isPresent()) {
            bathroomRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //10 legnepszerubb product megjelenese a fooldalon
    /*@GetMapping("/getMostOrderedFoods")
    public ResponseEntity<Category> getMostOrderedFoods() {
        //CategoryRepository.categoryOfOrderedFood.
        return ResponseEntity.notFound().build();
    }*/
}

