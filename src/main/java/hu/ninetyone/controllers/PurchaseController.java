package hu.ninetyone.controllers;

import hu.ninetyone.entities.Purchase;
import hu.ninetyone.entities.User;
import hu.ninetyone.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Purchase>> getAll() {
        return ResponseEntity.ok(purchaseRepository.findAll());
    }

    @GetMapping("/{id}")
    public List<Purchase> get(@PathVariable Integer id) {
        return purchaseRepository.findAllByUser(id);
    }

    @PostMapping("")
    public ResponseEntity<Purchase> post(@RequestBody Purchase purchase) {
        Purchase savedPurchase = purchaseRepository.save(purchase);
        return ResponseEntity.ok(savedPurchase);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Purchase> update(@PathVariable Integer id, @RequestBody Purchase purchase) {
        Optional<Purchase> optPurchase = purchaseRepository.findById(id);
        if (optPurchase.isPresent()) {
            purchase.setId(id);
            return ResponseEntity.ok(purchaseRepository.save(purchase));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Purchase> delete(@PathVariable Integer id) {
        Optional<Purchase> optPurchase = purchaseRepository.findById(id);
        if (optPurchase.isPresent()) {
            purchaseRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
/*
    @PutMapping("/takePurchaseDelivered/{id}")
    public ResponseEntity<Purchase> takePurchaseDelivered (@PathVariable Integer id) {
        Optional<Purchase> oPurchase = purchaseRepository.findById(id);
        if (oPurchase.isPresent()) {
            Purchase purchase = oPurchase.get();
            purchase.setDelivered(true);
            return ResponseEntity.ok(purchaseRepository.save(purchase));
        }
        return ResponseEntity.notFound().build();
    }
*/
/*
    @GetMapping("/isDelivered")
    public ResponseEntity<List<Purchase>> isDelivered() {
        Iterable<Purchase> purchase = purchaseRepository.findAll();
        List<Purchase> list = new ArrayList<>();
        for(Purchase p : purchase){
            if(p.isDelivered()){
                list.add(p);
            }
        }
        if(list.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(list);
        }
    }
*/
   /* @GetMapping("/isDelivered/{id}")
    public ResponseEntity<List<Purchase>> isDeliveredId(@PathVariable Integer id) {
        Optional<Purchase> oPurchase = purchaseRepository.findById(id);
        List<Purchase> list = new ArrayList<>();
        if (oPurchase.isPresent() && oPurchase.get().isDelivered()) {
            Purchase purchase = oPurchase.get();
            list.add(purchase);
        }
        if(list.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(list);
        }
    }*/
/*
    @GetMapping("/isNotDelivered")
    public ResponseEntity<Iterable<Purchase>> isNotDelivered() {
        Iterable<Purchase> purchase = purchaseRepository.findAll();
        List<Purchase> list = new ArrayList<>();
        for(Purchase p : purchase){
            if(!p.isDelivered()){
                list.add(p);
            }
        }
        if(list.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(list);
        }
    }
*/
   /* @GetMapping("/isNotDelivered/{id}")
    public ResponseEntity<Iterable<Purchase>> isNotDeliveredById(
            @PathVariable Integer id) {
        Optional<Purchase> oPurchase = purchaseRepository.findById(id);
        List<Purchase> list = new ArrayList<>();
        if (oPurchase.isPresent() && !(oPurchase.get().isDelivered())) {
            Purchase purchase = oPurchase.get();
            list.add(purchase);
        }
        if(list.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(list);
        }
    }*/
/*
   //get customer by purchase_id
    @GetMapping("/customerBypurchaseId/{id}")
    public ResponseEntity<User> getCustomerByPurchaseId(@PathVariable Integer id) {
        Optional<Purchase> purchase = purchaseRepository.findById(id);
        if (purchase.isPresent()) {
            return ResponseEntity.ok(purchase.get().getUser());
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/
/*
    //get customers by product id
    @GetMapping("/customersByproductId/{id}")
    public ResponseEntity<Iterable<User>> getCustomersByProductId(@PathVariable Integer id) {
        Iterable<Purchase> purchase = purchaseRepository.findAll();
        List<User> list = new ArrayList<>();
        for(Purchase p : purchase){
            if(p.getProduct().getId().equals(id)){
                list.add(p.getUser());
            }
        }
        if(list.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(list);
        }
    }*/
}
