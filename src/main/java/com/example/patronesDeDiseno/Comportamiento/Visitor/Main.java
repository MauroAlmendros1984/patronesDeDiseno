package com.example.patronesDeDiseno.Comportamiento.Visitor;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        ComputerPartVisitor displayVisitor = new ComputerPartDisplayVisitor();
        computer.accept(displayVisitor);

        ComputerPartPriceVisitor priceVisitor = new ComputerPartPriceVisitor();
        computer.accept(priceVisitor);
        System.out.println("Total Price: " + priceVisitor.getTotalPrice());
    }
}

//El patrón Visitor permite definir una operación sobre una estructura de objetos sin cambiar
// las clases de los objetos en dicha estructura. Es útil cuando se desea realizar operaciones
// sobre una estructura de objetos compleja, especialmente si las operaciones pueden cambiar
// frecuentemente

//Supongamos que tenemos una estructura de elementos que representan partes de un ordenador
// (CPU, GPU y Disco Duro) y queremos definir diferentes operaciones (como calcular el precio
// total y mostrar detalles).

//ComputerPart: La interfaz ComputerPart declara el método accept que acepta un visitante.
//CPU, GPU, HardDrive y Computer: Implementan la interfaz ComputerPart y definen cómo aceptar
// un visitante.
//ComputerPartVisitor: La interfaz ComputerPartVisitor declara métodos visit para cada tipo de
// ComputerPart.
//ComputerPartDisplayVisitor: Implementa la interfaz ComputerPartVisitor para mostrar detalles de
// cada parte del ordenador.
//ComputerPartPriceVisitor: Implementa la interfaz ComputerPartVisitor para calcular el precio
// total del ordenador.
//Main: La clase principal que demuestra cómo usar el patrón Visitor para realizar diferentes
// operaciones sobre la estructura del ordenador.

//Este ejemplo muestra cómo usar el patrón Visitor para separar las operaciones de los
// objetos sobre los que operan. Permite agregar nuevas operaciones sin modificar las clases
// de los elementos sobre los que operan, facilitando la extensión y el mantenimiento del código.
