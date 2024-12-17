package com.example.patronesDeDiseno.Estructurales.Decorator;

public class SimpleCoffee  implements Coffee {
    @Override
    public double cost() {
        return 1.0; // Precio base del café simple
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
