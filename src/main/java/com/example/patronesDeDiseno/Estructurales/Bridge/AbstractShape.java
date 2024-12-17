package com.example.patronesDeDiseno.Estructurales.Bridge;

public abstract class AbstractShape implements Shape {
    protected DrawAPI drawAPI;

    protected AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}
