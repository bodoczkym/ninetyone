package hu.ninetyone.controllers;

import hu.ninetyone.entities.Sold;
import hu.ninetyone.repositories.SoldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/sold")
public class SoldController {
    @Autowired
    private SoldRepository soldRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Sold>> getAll() {
        return ResponseEntity.ok(soldRepository.findAll());
    }

    @GetMapping("/{rate}")
    public List<Sold> get(@PathVariable Integer rate) {
        return soldRepository.findAllByRate(rate);
    }

    @PostMapping("")
    public ResponseEntity<Sold> post(@RequestBody Sold sold) {
        Sold savedSold = soldRepository.save(sold);
        return ResponseEntity.ok(savedSold);
    }
}
