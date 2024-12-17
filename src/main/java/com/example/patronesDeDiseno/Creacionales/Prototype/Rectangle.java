package com.example.patronesDeDiseno.Creacionales.Prototype;

public class Rectangle implements Shape {
    @Override
    public Shape clone() {
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
