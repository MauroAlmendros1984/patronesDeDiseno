package com.example.patronesDeDiseno.Comportamiento.State;

public class HasMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        System.out.println("Already have enough money.");
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        machine.setProduct(product);
        System.out.println("Product selected: " + product);
        machine.setState(new ProductSelectedState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Select product first.");
    }
}
