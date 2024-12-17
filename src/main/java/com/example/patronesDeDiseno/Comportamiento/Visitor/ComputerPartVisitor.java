package com.example.patronesDeDiseno.Comportamiento.Visitor;

public interface ComputerPartVisitor {
    void visit(CPU cpu);
    void visit(GPU gpu);
    void visit(HardDrive hardDrive);
    void visit(Computer computer);
}
