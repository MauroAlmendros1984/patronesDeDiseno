package com.example.patronesDeDiseno.Comportamiento.Visitor;

public class ComputerPartPriceVisitor implements ComputerPartVisitor {
    private double totalPrice = 0;

    @Override
    public void visit(CPU cpu) {
        totalPrice += 200;
    }

    @Override
    public void visit(GPU gpu) {
        totalPrice += 400;
    }

    @Override
    public void visit(HardDrive hardDrive) {
        totalPrice += 100;
    }

    @Override
    public void visit(Computer computer) {
        totalPrice += 50; // Base price for the computer case
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
