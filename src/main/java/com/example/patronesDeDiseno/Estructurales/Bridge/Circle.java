package com.example.patronesDeDiseno.Estructurales.Bridge;

public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius);
    }
}
