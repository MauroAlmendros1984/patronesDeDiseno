package com.example.patronesDeDiseno.Estructurales.Bridge;

public class Main {
    public static void main(String[] args) {
        DrawAPI svgDraw = new SvgDraw();
        DrawAPI pngDraw = new PngDraw();

        Shape circleSvg = new Circle(5, svgDraw);
        Shape circlePng = new Circle(10, pngDraw);
        Shape squareSvg = new Square(4, svgDraw);
        Shape squarePng = new Square(8, pngDraw);

        circleSvg.draw();
        circlePng.draw();
        squareSvg.draw();
        squarePng.draw();
    }
}

//Bridge es un patrón de diseño estructural que te permite dividir una clase grande, o un grupo
//de clases estrechamente relacionadas, en dos jerarquías separadas (abstracción e implementación)
//que pueden desarrollarse independientemente la una de la otra.

//Supongamos que queremos implementar diferentes formas geométricas (como círculos y cuadrados)
//que pueden ser dibujadas utilizando diferentes implementaciones de dibujantes (como dibujar
//en formato SVG o en formato PNG).
//Primero, definimos la interfaz DrawAPI que representa la implementación del dibujante
//Luego, creamos una interfaz Shape que representa una forma geométrica y utiliza la
//interfaz DrawAPI para dibujar. Ahora, podemos utilizar las clases y la interfaz.

//En este ejemplo, Circle y Square son abstracciones que pueden utilizar diferentes
//implementaciones de DrawAPI para dibujarse. Cuando se crean instancias de Circle
//y Square, se les pasa una implementación específica de DrawAPI que determina cómo
//se dibujarán. Esto permite que las formas geométricas se dibujen en diferentes
//formatos (SVG o PNG) sin modificar las clases de las formas geométricas mismas.