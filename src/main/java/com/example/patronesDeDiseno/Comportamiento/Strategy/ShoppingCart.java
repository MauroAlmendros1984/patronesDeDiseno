package com.example.patronesDeDiseno.Comportamiento.Strategy;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
