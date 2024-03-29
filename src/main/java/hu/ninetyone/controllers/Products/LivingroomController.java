package hu.ninetyone.controllers.Products;

import hu.ninetyone.entities.Products.Kitchen;
import hu.ninetyone.entities.Products.Livingroom;
import hu.ninetyone.repositories.CategoryRepository;
import hu.ninetyone.repositories.ProductRepository;
import hu.ninetyone.repositories.Products.BedroomRepository;
import hu.ninetyone.repositories.Products.KitchenRepository;
import hu.ninetyone.repositories.Products.LivingroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/living-room")
public class LivingroomController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private LivingroomRepository livingroomRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Livingroom>> getAll() {
        return ResponseEntity.ok(livingroomRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livingroom> getById(@PathVariable Integer id) {
        /*Optional<Bedroom> bedroom = bedroomRepository.findByStocknumber(stocknumber);
        if (bedroom.isPresent()) {
            return ResponseEntity.ok(bedroom.get());
        } else {
            return ResponseEntity.notFound().build();
        }*/
        Optional<Livingroom> bedroom = livingroomRepository.findById(id);
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
    public ResponseEntity<Livingroom> post(@RequestBody Livingroom living) {
        Livingroom savedLiving = livingroomRepository.save(living);
        return ResponseEntity.ok(savedLiving);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livingroom> update(@PathVariable Integer id,
                                           @RequestBody Livingroom bathroom) {
        Optional<Livingroom> optBathroom = livingroomRepository.findById(id);
        if (optBathroom.isPresent()) {
            bathroom.setId(id);
            return ResponseEntity.ok(livingroomRepository.save(bathroom));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Livingroom> delete(@PathVariable Integer id) {
        Optional<Livingroom> isPresent = livingroomRepository.findById(id);
        if (isPresent.isPresent()) {
            livingroomRepository.deleteById(id);
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

