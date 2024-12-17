package com.example.patronesDeDiseno.Estructurales.Flyweight;

public class EBook {
    private String title;
    private String author;
    private String content; // Supongamos que el contenido es grande, por lo que es costoso almacenarlo para cada libro

    public EBook(String title, String author) {
        this.title = title;
        this.author = author;
        // El contenido se inicializa en blanco
        this.content = "";
    }

    // Método para establecer el contenido del libro electrónico
    public void setContent(String content) {
        this.content = content;
    }

    // Método para mostrar los detalles del libro electrónico
    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
}
