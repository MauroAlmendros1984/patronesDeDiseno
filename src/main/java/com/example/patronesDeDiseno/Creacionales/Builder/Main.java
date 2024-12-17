package com.example.patronesDeDiseno.Creacionales.Builder;

public class Main {
    public static void main(String[] args) {
        // Creamos un director
        Director director = new Director();

        // Creamos un builder de pizza vegetariana
        PizzaBuilder vegetarianPizzaBuilder = new VegetarianPizzaBuilder();

        // Configuramos el director para utilizar el builder de pizza vegetariana
        director.setPizzaBuilder(vegetarianPizzaBuilder);

        // Construimos la pizza
        director.constructPizza();

        // Obtenemos la pizza
        Pizza vegetarianPizza = director.getPizza();

        // Imprimimos la pizza
        System.out.println("Vegetarian Pizza:");
        System.out.println(vegetarianPizza);
    }
}

//Builder permite construir objetos complejos paso a paso. El patrón nos permite producir distintos
//tipos y representaciones de un objeto empleando el mismo código de construcción.

//Aqui creamos un objeto Pizza, donde el proceso de creación de una pizza puede ser
//complejo, con múltiples ingredientes y opciones de personalización.
//En este ejemplo, el director (Director) controla el proceso de construcción de la pizza utilizando
//un builder (PizzaBuilder). El builder concreto (VegetarianPizzaBuilder) proporciona la lógica
//específica para construir una pizza vegetariana. La construcción de la pizza se realiza paso a
//paso invocando los métodos del builder (buildDough(), buildSauce(), buildTopping()), y
//finalmente obtenemos la pizza resultante con el método getPizza(). Este enfoque nos permite
//construir pizzas con diferentes características y configuraciones, manteniendo el código limpio
//y modular.
