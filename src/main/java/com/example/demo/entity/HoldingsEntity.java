package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class HoldingsEntity {
    @Id
    private int stockID;
    private String stock_name;
    private int quantity;
    private double buyPrice;
    private double currentPrice;
    private double profitPercentage;
}
