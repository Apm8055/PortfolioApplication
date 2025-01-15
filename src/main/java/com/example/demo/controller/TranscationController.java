package com.example.demo.controller;

import com.example.demo.entity.TransactionEntity;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Transaction")
public class TranscationController {

    public boolean payment(TransactionEntity transaction){
        return true;
        // A temporary function to complete the payment of the buying or selling of the stock.
    }

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public ResponseEntity<String> transactionController(@RequestBody TransactionEntity transaction){
        if(payment(transaction)){
            transactionRepository.save(transaction);
            return ResponseEntity.ok("Success");
        }else{
            return ResponseEntity.ok("Failure, unable to complete the transaction.");
        }
    }
}
