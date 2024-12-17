package com.example.patronesDeDiseno.Comportamiento.Visitor;

public class CPU implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
