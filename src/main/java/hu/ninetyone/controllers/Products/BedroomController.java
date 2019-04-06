package hu.ninetyone.controllers.Products;

import hu.ninetyone.entities.Products.Bedroom;
import hu.ninetyone.repositories.CategoryRepository;
import hu.ninetyone.repositories.ProductRepository;
import hu.ninetyone.repositories.Products.BedroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/bedroom")
public class BedroomController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BedroomRepository bedroomRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Bedroom>> getAll() {
        return ResponseEntity.ok(bedroomRepository.findAll());
    }

   /*@GetMapping("/{id}")
    public ResponseEntity<Bedroom> get(@PathVariable Integer id) {
        Optional<Bedroom> bedroom = bedroomRepository.findById(id);
        if (bedroom.isPresent()) {
            return ResponseEntity.ok(bedroom.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<Bedroom> getById(@PathVariable Integer id) {
        /*Optional<Bedroom> bedroom = bedroomRepository.findByStocknumber(stocknumber);
        if (bedroom.isPresent()) {
            return ResponseEntity.ok(bedroom.get());
        } else {
            return ResponseEntity.notFound().build();
        }*/
        Optional<Bedroom> bedroom = bedroomRepository.findById(id);
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
    public ResponseEntity<Bedroom> post(@RequestBody Bedroom bedroom) {
        Bedroom savedBed = bedroomRepository.save(bedroom);
        return ResponseEntity.ok(savedBed);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bedroom> update(@PathVariable Integer id,
                                           @RequestBody Bedroom bedroom) {
        System.out.println("DDDDD" + bedroom);
        Optional<Bedroom> optBedroom = bedroomRepository.findById(id);
        if (optBedroom.isPresent()) {
            bedroom.setId(id);
            return ResponseEntity.ok(bedroomRepository.save(bedroom));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bedroom> delete(@PathVariable Integer id) {
        Optional<Bedroom> isPresent = bedroomRepository.findById(id);
        if (isPresent.isPresent()) {
            bedroomRepository.deleteById(id);
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

