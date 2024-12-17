package com.example.patronesDeDiseno.Estructurales.Bridge;

public class PngDraw implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing circle in PNG with radius " + radius);
    }

    @Override
    public void drawSquare(int side) {
        System.out.println("Drawing square in PNG with side " + side);
    }
}
