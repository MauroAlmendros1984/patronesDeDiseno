package com.example.patronesDeDiseno.Comportamiento.TemplateMethod;

public class Coffee extends HotBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
