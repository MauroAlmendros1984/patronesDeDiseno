package com.example.patronesDeDiseno.Estructurales.Flyweight;

public class Main {
    public static void main(String[] args) {
        // Creamos una fábrica de libros electrónicos
        EBookFactory ebookFactory = new EBookFactory();

        // Creamos algunos libros electrónicos con contenido
        EBook ebook1 = ebookFactory.getEBook("Design Patterns", "Gang of Four");
        ebook1.setContent("This is the content of Design Patterns book");

        EBook ebook2 = ebookFactory.getEBook("Clean Code", "Robert C. Martin");
        ebook2.setContent("This is the content of Clean Code book");

        // Mostramos los libros electrónicos
        System.out.println("=== Showing ebooks ===");
        ebook1.show();
        System.out.println();
        ebook2.show();
    }
}

//Flyweight es un patrón de diseño estructural que te permite mantener más objetos dentro de la
//cantidad disponible de RAM compartiendo las partes comunes del estado entre varios objetos en
//lugar de mantener toda la información en cada objeto.

//En este ejemplo, creamos dos libros electrónicos utilizando la fábrica EBookFactory.
//Si intentamos crear un libro electrónico con el mismo título y autor, en lugar de crear un
//nuevo objeto, la fábrica verifica si ya existe un libro electrónico con esos detalles y lo
//devuelve. Esto permite que los libros electrónicos con el mismo título y autor compartan la
//misma instancia, lo que minimiza el uso de memoria.
