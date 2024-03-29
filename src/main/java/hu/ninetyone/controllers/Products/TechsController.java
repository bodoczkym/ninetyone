package hu.ninetyone.controllers.Products;

import hu.ninetyone.entities.Products.Techs;
import hu.ninetyone.repositories.CategoryRepository;
import hu.ninetyone.repositories.ProductRepository;
import hu.ninetyone.repositories.Products.TechsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/techs")
public class TechsController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TechsRepository techsRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Techs>> getAll() {
        return ResponseEntity.ok(techsRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Techs> getById(@PathVariable Integer id) {
        /*Optional<Bedroom> bedroom = bedroomRepository.findByStocknumber(stocknumber);
        if (bedroom.isPresent()) {
            return ResponseEntity.ok(bedroom.get());
        } else {
            return ResponseEntity.notFound().build();
        }*/
        Optional<Techs> bedroom = techsRepository.findById(id);
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
    public ResponseEntity<Techs> post(@RequestBody Techs techs) {
        Techs savedTechs = techsRepository.save(techs);
        return ResponseEntity.ok(savedTechs);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Techs> update(@PathVariable Integer id,
                                           @RequestBody Techs bathroom) {
        Optional<Techs> optBathroom = techsRepository.findById(id);
        if (optBathroom.isPresent()) {
            bathroom.setId(id);
            return ResponseEntity.ok(techsRepository.save(bathroom));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Techs> delete(@PathVariable Integer id) {
        Optional<Techs> isPresent = techsRepository.findById(id);
        if (isPresent.isPresent()) {
            techsRepository.deleteById(id);
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

