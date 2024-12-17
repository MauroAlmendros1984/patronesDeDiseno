package com.example.patronesDeDiseno.Creacionales.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    // Método para agregar prototipos al registro
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        shapeMap.put("Rectangle", rectangle);

        Circle circle = new Circle();
        circle.draw();
        shapeMap.put("Circle", circle);
    }

    // Método para obtener un prototipo del registro
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
}
