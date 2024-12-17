package com.example.patronesDeDiseno.Estructurales.Decorator;

public class Main {
    public static void main(String[] args) {
        // Creamos un café simple
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: $" + simpleCoffee.cost());
        System.out.println("Description of Simple Coffee: " + simpleCoffee.getDescription());

        // Decoramos el café con leche
        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("\nCost of Coffee with Milk: $" + coffeeWithMilk.cost());
        System.out.println("Description of Coffee with Milk: " + coffeeWithMilk.getDescription());

        // Decoramos el café con leche y crema
        Coffee coffeeWithMilkAndCream = new CreamDecorator(coffeeWithMilk);
        System.out.println("\nCost of Coffee with Milk and Cream: $" + coffeeWithMilkAndCream.cost());
        System.out.println("Description of Coffee with Milk and Cream: " + coffeeWithMilkAndCream.getDescription());
    }
}

//Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos
//colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas
//funcionalidades.

//Primero, definimos una interfaz común para todos los tipos de café.
//Luego, creamos una clase concreta que implemente esta interfaz representando un café básico.
//Creamos los decoradores que añaden funcionalidades adicionales al café básico:

//En este ejemplo, creamos un café simple y luego lo decoramos con leche y crema. Cada decorador
//agrega funcionalidades adicionales al café básico sin modificar su estructura. Esto nos permite
//componer diferentes combinaciones de funcionalidades de manera flexible y dinámica.
