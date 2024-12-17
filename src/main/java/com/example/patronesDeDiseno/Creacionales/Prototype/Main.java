package com.example.patronesDeDiseno.Creacionales.Prototype;

public class Main {
    public static void main(String[] args) {
        // Cargar las formas en el registro
        ShapeCache.loadCache();

        // Obtener y clonar una forma de tipo Rectangle
        Shape clonedShape1 = ShapeCache.getShape("Rectangle");
        System.out.println("Shape: " + clonedShape1.getClass().getSimpleName());
        clonedShape1.draw();  // Output: Drawing Rectangle

        // Obtener y clonar una forma de tipo Circle
        Shape clonedShape2 = ShapeCache.getShape("Circle");
        System.out.println("Shape: " + clonedShape2.getClass().getSimpleName());
        clonedShape2.draw();  // Output: Drawing Circle
    }
}
//Prototype nos permite copiar objetos existentes sin que el código dependa de sus clases.

//Prototype se utiliza para crear nuevos objetos copiando un prototipo existente,
//permitiendo así clonar objetos sin acoplar el código a sus clases concretas.

//En este ejemplo, la interfaz Shape define el método clone() para clonar una forma y
//el método draw() para dibujarla.
//Las clases concretas Rectangle y Circle implementan la interfaz Shape y proporcionan sus
//propias implementaciones de los métodos clone() y draw().
//La clase ShapeCache actúa como un registro de prototipos y almacena instancias de formas
//para ser clonadas posteriormente.

//primero cargamos las formas en el registro utilizando ShapeCache.loadCache().
//Luego, obtenemos y clonamos formas específicas según sea necesario utilizando
//ShapeCache.getShape("Rectangle") y ShapeCache.getShape("Circle").
//Este patrón nos permite crear nuevas formas a partir de prototipos existentes sin
//depender de sus clases concretas, lo que lo hace útil cuando el tipo de objeto a
//crear debe determinarse en tiempo de ejecución o cuando la creación de un nuevo
//objeto es costosa en términos de recursos.
