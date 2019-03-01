package hu.ninetyone.controllers;

import hu.ninetyone.entities.Category;
import hu.ninetyone.repositories.CategoryRepository;
import hu.ninetyone.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Category>> getAll() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> get(@PathVariable Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            return ResponseEntity.ok(category.get());
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
    public ResponseEntity<Category> post(@RequestBody Category category) {
        Category savedCategory = categoryRepository.save(category);
        return ResponseEntity.ok(savedCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@PathVariable Integer id,
                                           @RequestBody Category category) {
        Optional<Category> optCategory = categoryRepository.findById(id);
        if (optCategory.isPresent()) {
            category.setId(id);
            return ResponseEntity.ok(categoryRepository.save(category));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Category> delete(@PathVariable Integer id) {
        Optional<Category> optCategory = categoryRepository.findById(id);
        if (optCategory.isPresent()) {
            categoryRepository.deleteById(id);
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
