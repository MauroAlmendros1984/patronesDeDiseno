package com.example.patronesDeDiseno.Comportamiento.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();
    private int currentIndex = -1;

    public void add(Memento state) {
        // Limpiar lista después del índice actual para soportar operaciones de rehacer
        if (currentIndex != mementoList.size() - 1) {
            mementoList = mementoList.subList(0, currentIndex + 1);
        }
        mementoList.add(state);
        currentIndex++;
    }

    public Memento undo() {
        if (currentIndex <= 0) {
            System.out.println("No more undos.");
            return mementoList.get(0);
        }
        currentIndex--;
        return mementoList.get(currentIndex);
    }

    public Memento redo() {
        if (currentIndex >= mementoList.size() - 1) {
            System.out.println("No more redos.");
            return mementoList.get(currentIndex);
        }
        currentIndex++;
        return mementoList.get(currentIndex);
    }
}
