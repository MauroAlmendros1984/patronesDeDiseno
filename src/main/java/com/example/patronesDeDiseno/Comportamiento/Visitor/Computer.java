package com.example.patronesDeDiseno.Comportamiento.Visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new CPU(), new GPU(), new HardDrive()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
