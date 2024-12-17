package com.example.patronesDeDiseno.Comportamiento.Visitor;

public class HardDrive implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
