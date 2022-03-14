package com.example.ccrepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepo extends CrudRepository<CreditCard, Integer> {
}
