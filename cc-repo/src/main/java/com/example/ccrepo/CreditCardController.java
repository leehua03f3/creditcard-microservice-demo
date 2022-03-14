package com.example.ccrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CreditCardController {

    @Autowired
    private CreditCardRepo creditCardRepo;

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<CreditCard> getById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(creditCardRepo.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<ArrayList<CreditCard>> getAll() {
        return new ResponseEntity<>((ArrayList<CreditCard>) creditCardRepo.findAll(), HttpStatus.OK);
    }
}

