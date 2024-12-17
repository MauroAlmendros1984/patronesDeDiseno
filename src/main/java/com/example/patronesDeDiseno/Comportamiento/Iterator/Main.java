package com.example.patronesDeDiseno.Comportamiento.Iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}

//Iterator se utiliza para proporcionar una forma de acceder a los elementos de un objeto agregado
// de manera secuencial sin exponer su representación subyacente.

//Iterator: La interfaz Iterator declara los métodos hasNext y next que todos los iteradores
// deben implementar.
//Container: La interfaz Container declara el método getIterator que devuelve un iterador para
// la colección.
//NameRepository: Es una clase concreta que implementa la interfaz Container. Contiene una matriz
// de nombres y devuelve un NameIterator que puede iterar sobre esa matriz.
//NameIterator: Es una clase interna privada de NameRepository que implementa la interfaz Iterator.
// Proporciona la lógica para iterar sobre la colección de nombres.
//Main: Crea una instancia de NameRepository, obtiene un iterador y lo usa para recorrer e imprimir
// los nombres en la colección.

//Este ejemplo muestra cómo usar el patrón Iterator para acceder secuencialmente a los elementos
// de una colección sin exponer su representación subyacente. Esto proporciona una forma flexible
// de recorrer diferentes tipos de colecciones de manera uniforme.
