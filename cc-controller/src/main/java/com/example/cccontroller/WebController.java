package com.example.cccontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class WebController {
    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/getall")
    public ResponseEntity<List<CreditCard>> getAll(@RequestParam(required = false, defaultValue = "1") Integer page,
                                             @RequestParam(required = false, defaultValue = "5") Integer row) {
        ArrayList<CreditCard> creditCards = (ArrayList<CreditCard>) restTemplate.getForObject("http://cc-repo/getall", List.class)
                .stream()
                .skip(row * (page - 1))
                .limit(row)
                .collect(Collectors.toList());
        return new ResponseEntity<>(creditCards,HttpStatus.OK);
    }
}
