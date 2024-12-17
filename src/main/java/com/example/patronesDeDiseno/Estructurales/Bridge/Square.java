package com.example.patronesDeDiseno.Estructurales.Bridge;

public class Square extends AbstractShape {
    private int side;

    public Square(int side, DrawAPI drawAPI) {
        super(drawAPI);
        this.side = side;
    }

    @Override
    public void draw() {
        drawAPI.drawSquare(side);
    }
}
