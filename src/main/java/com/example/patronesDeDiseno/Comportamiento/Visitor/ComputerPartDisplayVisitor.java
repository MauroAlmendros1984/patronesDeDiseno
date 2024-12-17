package com.example.patronesDeDiseno.Comportamiento.Visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(CPU cpu) {
        System.out.println("Displaying CPU.");
    }

    @Override
    public void visit(GPU gpu) {
        System.out.println("Displaying GPU.");
    }

    @Override
    public void visit(HardDrive hardDrive) {
        System.out.println("Displaying Hard Drive.");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }
}
