package com.example.patronesDeDiseno.Comportamiento.Interpreter;

public class Main {
    public static void main(String[] args) {
        // (5 + 10) - (2 + 3)
        Expression expr1 = new Addition(new Number(5), new Number(10));
        Expression expr2 = new Addition(new Number(2), new Number(3));
        Expression mainExpr = new Subtraction(expr1, expr2);

        int result = mainExpr.interpret();
        System.out.println("(5 + 10) - (2 + 3) = " + result);
    }
}

//Interpreter se utiliza para definir una representación gramatical para un lenguaje
//y un intérprete que usa la representación para interpretar oraciones en el lenguaje.
//Estamos creando un intérprete simple para evaluar expresiones matemáticas que
//consisten en sumas y restas.

//Expression: La interfaz Expression declara el método interpret que todos los nodos en la
// jerarquía de expresiones deben implementar
//Number: Representa un número literal en la expresión. Implementa el método interpret para
// devolver su valor.
//Addition: Representa una operación de suma en la expresión. Implementa el método interpret
// para devolver la suma de las dos expresiones que contiene.
//Subtraction: Representa una operación de resta en la expresión. Implementa el método
// interpret para devolver la resta de las dos expresiones que contiene.
//Main: Crea una expresión compuesta utilizando las clases Addition y Subtraction, y luego
// interpreta la expresión completa.

//Este ejemplo demuestra cómo usar el patrón Interpreter para evaluar una expresión matemática
// simple. Puedes extender este patrón para soportar operaciones más complejas o diferentes
// tipos de gramáticas.
