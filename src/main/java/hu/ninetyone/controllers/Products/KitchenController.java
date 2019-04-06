package hu.ninetyone.controllers.Products;

import hu.ninetyone.entities.Products.Kitchen;
import hu.ninetyone.repositories.CategoryRepository;
import hu.ninetyone.repositories.ProductRepository;
import hu.ninetyone.repositories.Products.BedroomRepository;
import hu.ninetyone.repositories.Products.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/kitchen")
public class KitchenController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private KitchenRepository kitchenRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Kitchen>> getAll() {
        return ResponseEntity.ok(kitchenRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kitchen> getById(@PathVariable Integer id) {
        /*Optional<Bedroom> bedroom = bedroomRepository.findByStocknumber(stocknumber);
        if (bedroom.isPresent()) {
            return ResponseEntity.ok(bedroom.get());
        } else {
            return ResponseEntity.notFound().build();
        }*/
        Optional<Kitchen> bedroom = kitchenRepository.findById(id);
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
    public ResponseEntity<Kitchen> post(@RequestBody Kitchen kitchen) {
        Kitchen savedKitchen = kitchenRepository.save(kitchen);
        return ResponseEntity.ok(savedKitchen);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kitchen> update(@PathVariable Integer id,
                                          @RequestBody Kitchen kitchen) {
        Optional<Kitchen> optKitchen = kitchenRepository.findById(id);
        if (optKitchen.isPresent()) {
            kitchen.setId(id);
            return ResponseEntity.ok(kitchenRepository.save(kitchen));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Kitchen> delete(@PathVariable Integer id) {
        Optional<Kitchen> isPresent = kitchenRepository.findById(id);
        if (isPresent.isPresent()) {
            kitchenRepository.deleteById(id);
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

