package com.example.patronesDeDiseno.Comportamiento.State;

public class ReadyState implements State {
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        machine.setAmount(amount);
        System.out.println("Money inserted: " + amount);
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Insert money first.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Insert money and select product first.");
    }
}
