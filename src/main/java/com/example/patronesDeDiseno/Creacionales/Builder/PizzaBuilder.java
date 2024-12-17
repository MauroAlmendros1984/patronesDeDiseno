package com.example.patronesDeDiseno.Creacionales.Builder;

public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    Pizza getPizza();
}
