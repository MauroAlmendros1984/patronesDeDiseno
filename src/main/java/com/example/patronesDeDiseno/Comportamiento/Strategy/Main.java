package com.example.patronesDeDiseno.Comportamiento.Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Aplicar un descuento del 10%
        cart.setDiscountStrategy(new PercentageDiscountStrategy(10));
        double price1 = cart.calculatePrice(100);
        System.out.println("Price after 10% discount: " + price1);

        // Aplicar un descuento fijo de 15
        cart.setDiscountStrategy(new FixedDiscountStrategy(15));
        double price2 = cart.calculatePrice(100);
        System.out.println("Price after $15 discount: " + price2);

        // No aplicar descuento
        cart.setDiscountStrategy(new NoDiscountStrategy());
        double price3 = cart.calculatePrice(100);
        System.out.println("Price without discount: " + price3);
    }
}

//El patrón Strategy permite definir una familia de algoritmos, encapsular cada uno de ellos y
// hacerlos intercambiables. El patrón Strategy permite que el algoritmo varíe independientemente
// de los clientes que lo utilice

//DiscountStrategy: La interfaz DiscountStrategy declara el método applyDiscount, que debe ser
// implementado por todas las estrategias de descuento concretas.
//PercentageDiscountStrategy: Implementa una estrategia de descuento porcentual.
//FixedDiscountStrategy: Implementa una estrategia de descuento fijo.
//NoDiscountStrategy: Implementa una estrategia sin descuento.
//ShoppingCart: La clase ShoppingCart utiliza una referencia a la estrategia de descuento actual
// y delega el cálculo del precio con descuento a la estrategia.
//Main: La clase principal que demuestra cómo cambiar dinámicamente las estrategias de descuento
// y calcular el precio final de acuerdo con la estrategia seleccionada.

//Este ejemplo muestra cómo usar el patrón Strategy para aplicar diferentes tipos de descuentos
// a un precio de producto. Al encapsular las estrategias de descuento en sus propias clases
// y hacer que el contexto (ShoppingCart)
// utilice estas estrategias de manera intercambiable, logramos un diseño flexible y extensible.