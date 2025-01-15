package com.example.demo.controller;

import com.example.demo.entity.StockEntity;
import com.example.demo.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    public StockRepository stockRepository;

    @GetMapping("/{stockId}")
    public ResponseEntity<StockEntity> stockController(@PathVariable long stockID){
        Optional<StockEntity> stock = stockRepository.findById(stockID);

        if(stock.isPresent()){
            return ResponseEntity.ok(stock.get());
        }else{
            return ResponseEntity.ok(null);
        }
    }
}
