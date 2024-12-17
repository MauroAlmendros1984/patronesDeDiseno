package com.example.patronesDeDiseno.Estructurales.Decorator;

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.3; // Se añade el costo de la crema
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cream";
    }
}
