package com.example.patronesDeDiseno.Comportamiento.State;

public class Main  {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertMoney(10);
        machine.selectProduct("Soda");
        machine.dispenseProduct();

        machine.insertMoney(5);
        machine.selectProduct("Chips");
        machine.dispenseProduct();
    }
}

//El patrón State permite a un objeto cambiar su comportamiento cuando cambia su estado interno.
//El objeto parecerá cambiar de clase. Este patrón es útil cuando un objeto necesita cambiar su
//comportamiento en función de su estado interno de forma dinámica.

//Supongamos que estamos desarrollando una máquina de venta automática que tiene diferentes
//estados: lista para recibir dinero, dispensar producto y devolver cambio.

//State: La interfaz State declara los métodos que deben ser implementados por cada estado concreto.
//ReadyState: Implementa el estado en el cual la máquina está lista para recibir dinero.
//HasMoneyState: Implementa el estado en el cual la máquina ha recibido dinero pero aún no se ha
//seleccionado un producto.
//ProductSelectedState: Implementa el estado en el cual se ha seleccionado un producto y la máquina
//está lista para dispensarlo.
//VendingMachine: La clase VendingMachine mantiene una referencia al estado actual y delega el
//comportamiento de acuerdo a su estado.
//Main: La clase principal que demuestra cómo cambiar de estados y comportamientos en la máquina
//expendedora.

//Este ejemplo muestra cómo usar el patrón State para manejar diferentes estados de una máquina
//expendedora. Cada estado maneja las acciones de manera diferente, lo que facilita la extensión
//y el mantenimiento del código.
