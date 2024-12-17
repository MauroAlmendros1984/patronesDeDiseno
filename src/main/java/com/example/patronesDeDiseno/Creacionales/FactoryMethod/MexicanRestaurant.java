package com.example.patronesDeDiseno.Creacionales.FactoryMethod;

public class MexicanRestaurant implements Restaurant {
    @Override
    public void displayMenu() {
        System.out.println("Menu of Fast Food Restaurant:");
        System.out.println("- Burger");
        System.out.println("- Fries");
        System.out.println("- Soda");
    }
}
