package com.example.patronesDeDiseno.Comportamiento.Strategy;

public class FixedDiscountStrategy implements DiscountStrategy {
    private double discount;

    public FixedDiscountStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }
}
