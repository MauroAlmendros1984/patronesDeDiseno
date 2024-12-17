package com.example.patronesDeDiseno.Creacionales.Prototype;

public class Circle implements Shape {
    @Override
    public Shape clone() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
