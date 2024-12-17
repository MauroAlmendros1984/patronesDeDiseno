package com.example.patronesDeDiseno.Comportamiento.Visitor;

public class GPU implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}