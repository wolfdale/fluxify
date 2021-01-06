package com.active.fluxify.repos;

import com.active.fluxify.entity.Transaction;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TransactionRepository extends ReactiveCrudRepository<Transaction, String> {

}
