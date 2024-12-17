package com.example.patronesDeDiseno.Comportamiento.State;

public class VendingMachine {
    private State state;
    private int amount;
    private String product;

    public VendingMachine() {
        state = new ReadyState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void insertMoney(int amount) {
        state.insertMoney(this, amount);
    }

    public void selectProduct(String product) {
        state.selectProduct(this, product);
    }

    public void dispenseProduct() {
        state.dispenseProduct(this);
    }
}
