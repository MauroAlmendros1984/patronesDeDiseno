package com.example.patronesDeDiseno.Estructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class EBookFactory {
    private Map<String, EBook> ebooks;

    public EBookFactory() {
        ebooks = new HashMap<>();
    }

    // Método para obtener un libro electrónico dado un título y autor
    public EBook getEBook(String title, String author) {
        // Si el libro electrónico ya existe, lo devolvemos
        String key = title + "-" + author;
        if (ebooks.containsKey(key)) {
            return ebooks.get(key);
        }
        // Si el libro electrónico no existe, lo creamos, lo almacenamos y lo devolvemos
        else {
            EBook ebook = new EBook(title, author);
            ebooks.put(key, ebook);
            return ebook;
        }
    }
}
