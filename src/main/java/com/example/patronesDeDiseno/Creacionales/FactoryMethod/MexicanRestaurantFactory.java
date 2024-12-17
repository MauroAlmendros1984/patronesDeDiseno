package com.example.patronesDeDiseno.Creacionales.FactoryMethod;

public class MexicanRestaurantFactory extends RestaurantFactory {
    @Override
    Restaurant createRestaurant() {
        return new MexicanRestaurant();
    }
}
