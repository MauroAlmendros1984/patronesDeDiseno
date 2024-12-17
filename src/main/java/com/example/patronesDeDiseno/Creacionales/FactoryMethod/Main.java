package com.example.patronesDeDiseno.Creacionales.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        // Creamos una fábrica de restaurante de comida rápida
        RestaurantFactory fastFoodFactory = new FastFoodRestaurantFactory();

        // Creamos un restaurante de comida rápida
        Restaurant fastFoodRestaurant = fastFoodFactory.createRestaurant();

        // Mostramos el menú del restaurante de comida rápida
        System.out.println("Menu of Fast Food Restaurant:");
        fastFoodRestaurant.displayMenu();

        // Creamos una fábrica de restaurante mexicano
        RestaurantFactory mexicanFactory = new MexicanRestaurantFactory();

        // Creamos un restaurante mexicano
        Restaurant mexicanRestaurant = mexicanFactory.createRestaurant();

        // Mostramos el menú del restaurante mexicano
        System.out.println("\nMenu of Mexican Restaurant:");
        mexicanRestaurant.displayMenu();
    }
}

//Factory method proporciona una interfaz para crear objetos en una superclase, mientras
//permite a las subclases alterar el tipo de objetos que se crearán.

//Estamos creando un programa de entrega de comida y queremos implementar un sistema para
//crear diferentes tipos de restaurantes y obtener sus menús.
//En este ejemplo, utilizamos el Factory Method para crear diferentes tipos de restaurantes
//(FastFoodRestaurant y MexicanRestaurant) utilizando sus respectivas fábricas
//(FastFoodRestaurantFactory y MexicanRestaurantFactory). Cada fábrica concreta implementa
//el método createRestaurant() para devolver una instancia del tipo de restaurante correspondiente.
//Esto nos permite crear objetos de diferentes clases, manteniendo la lógica de creación
//encapsulada en sus respectivas fábricas.
