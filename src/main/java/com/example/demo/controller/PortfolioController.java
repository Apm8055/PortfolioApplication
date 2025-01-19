package com.example.demo.controller;

import com.example.demo.entity.HoldingsEntity;
import com.example.demo.entity.PortfolioEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {


    private TransactionRepository transactionRepository;

    @Autowired
    public PortfolioController(TransactionRepository transactionRepository){
        this.transactionRepository=transactionRepository;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<PortfolioEntity> portfolioController(@PathVariable long userId){

        List<TransactionEntity> userTransaction = transactionRepository.findTransactionByUserID(userId);
        PortfolioEntity portfolioEntity = new PortfolioEntity();
        HashMap<Integer,Double> mp = new HashMap<>();

//        for(int i =0;i<userTransaction.size();i++){
//            int stockID = userTransaction.get(i).getStockID();
//            double tradePrice = userTransaction.get(i).getTradePrice();
//
//            mp.put(stockID, mp.getOrDefault(stockID, 0.0) + tradePrice);
//        }
//
//        portfolioEntity.setUserId(userId);
//        List<HoldingsEntity> temp;
//        for(Map.Entry<Integer,Double> entry: mp.entrySet()){
//
//        }


        return ResponseEntity.ok(portfolioEntity);

    }
}
