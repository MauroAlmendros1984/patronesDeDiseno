package com.example.patronesDeDiseno.Creacionales.Builder;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VegetarianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Mushrooms, onions, bell peppers");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
