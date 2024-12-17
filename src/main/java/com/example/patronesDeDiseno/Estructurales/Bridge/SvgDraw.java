package com.example.patronesDeDiseno.Estructurales.Bridge;

public class SvgDraw implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing circle in SVG with radius " + radius);
    }

    @Override
    public void drawSquare(int side) {
        System.out.println("Drawing square in SVG with side " + side);
    }
}