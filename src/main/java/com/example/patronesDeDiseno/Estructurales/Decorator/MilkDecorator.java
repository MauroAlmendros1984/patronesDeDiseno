package com.example.patronesDeDiseno.Estructurales.Decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // Se añade el costo de la leche
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
