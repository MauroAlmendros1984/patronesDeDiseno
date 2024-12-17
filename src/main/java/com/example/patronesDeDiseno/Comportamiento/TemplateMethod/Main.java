package com.example.patronesDeDiseno.Comportamiento.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        HotBeverage tea = new Tea();
        HotBeverage coffee = new Coffee();

        System.out.println("Preparing tea:");
        tea.prepareRecipe();

        System.out.println("\nPreparing coffee:");
        coffee.prepareRecipe();
    }
}

//Template Method define el esqueleto de un algoritmo en una operación,
// diferiendo algunos pasos a las subclases. Permite que las subclases redefinan
// ciertos pasos de un algoritmo sin cambiar la estructura del algoritmo.

//Estamos desarrollando un sistema para preparar diferentes tipos de bebidas calientes (té y café).

//HotBeverage: La clase abstracta HotBeverage define el método plantilla prepareRecipe, que es el
// esqueleto del algoritmo para preparar una bebida caliente. Este método llama a otros métodos
// (algunos concretos y algunos abstractos) en un orden específico. Los métodos abstractos brew y
// addCondiments deben ser implementados por las subclases.
//Tea: La clase Tea extiende HotBeverage e implementa los métodos brew y addCondiments específicos
// para preparar té.
//Coffee: La clase Coffee extiende HotBeverage e implementa los métodos brew y addCondiments
// específicos para preparar café.
//Main: La clase principal que demuestra cómo preparar té y café utilizando el método plantilla
// prepareRecipe.

//Este ejemplo muestra cómo usar el patrón Template Method para definir el proceso general de
// preparar una bebida caliente, permitiendo que las subclases concreten los detalles específicos
// de cada tipo de bebida (té y café) sin cambiar la estructura del algoritmo.
