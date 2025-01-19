package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class PortfolioEntity {
    @Id
    private long userId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HoldingsEntity> holdings;

    private int numberOfPortfolio;
    private double totalBuyPrice;
    private double totalProfitPercentage;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<HoldingsEntity> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<HoldingsEntity> holdings) {
        this.holdings = holdings;
    }

    public int getNumberOfPortfolio() {
        return numberOfPortfolio;
    }

    public void setNumberOfPortfolio(int numberOfPortfolio) {
        this.numberOfPortfolio = numberOfPortfolio;
    }

    public double getTotalBuyPrice() {
        return totalBuyPrice;
    }

    public void setTotalBuyPrice(double totalBuyPrice) {
        this.totalBuyPrice = totalBuyPrice;
    }

    public double getTotalProfitPercentage() {
        return totalProfitPercentage;
    }

    public void setTotalProfitPercentage(double totalProfitPercentage) {
        this.totalProfitPercentage = totalProfitPercentage;
    }
}
