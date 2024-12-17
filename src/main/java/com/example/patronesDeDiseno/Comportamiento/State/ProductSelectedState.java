package com.example.patronesDeDiseno.Comportamiento.State;

public class ProductSelectedState implements State {
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        System.out.println("Product already selected.");
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Product already selected.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Dispensing product: " + machine.getProduct());
        machine.setState(new ReadyState());
    }
}
