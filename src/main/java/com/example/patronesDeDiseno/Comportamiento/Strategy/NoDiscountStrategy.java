package com.example.patronesDeDiseno.Comportamiento.Strategy;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}
