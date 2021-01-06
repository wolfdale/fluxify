package com.active.fluxify.api;

import com.active.fluxify.entity.Transaction;
import com.active.fluxify.repos.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class TransController {
    @Autowired
    TransactionRepository transactionRepository;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Transaction> persistTransaction(@RequestBody Transaction transaction){
        return transactionRepository.save(transaction);
    }

    @GetMapping
    public Flux<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }

}
