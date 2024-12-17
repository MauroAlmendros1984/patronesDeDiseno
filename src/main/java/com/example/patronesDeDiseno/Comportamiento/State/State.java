package com.example.patronesDeDiseno.Comportamiento.State;

public interface State {
    void insertMoney(VendingMachine machine, int amount);
    void selectProduct(VendingMachine machine, String product);
    void dispenseProduct(VendingMachine machine);
}
