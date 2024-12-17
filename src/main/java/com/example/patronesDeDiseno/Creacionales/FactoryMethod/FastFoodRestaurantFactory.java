package com.example.patronesDeDiseno.Creacionales.FactoryMethod;

public class FastFoodRestaurantFactory extends RestaurantFactory {
    @Override
    Restaurant createRestaurant() {
        return new FastFoodRestaurant();
    }
}
