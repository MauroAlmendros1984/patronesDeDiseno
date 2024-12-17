package com.example.patronesDeDiseno.Comportamiento.Visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
