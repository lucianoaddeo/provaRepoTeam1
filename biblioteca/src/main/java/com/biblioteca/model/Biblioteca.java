package com.biblioteca.model;


import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    private static Libro[] dati = new Libro[100];
    private static int size = 0;

    public void aggiungi(Libro l) {
        if (size < dati.length) {
            dati[size++] = l;
        }
    }

    public void rimuovi(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                dati[i] = dati[i + 1];
            }
            dati[--size] = null;
        }
    }

    public int dimensione() {
        return size;
    }

    public Libro get(int index) {
        return dati[index];
    }

    public static void elencoLibri() {

        // Stampa gli elementi
        for (int i = 0; i < size; i++) {
            System.out.println(dati[i]);
        }

        if (size == 0){
            System.err.println("Non ci sono libri disponibili");
        }
    }
}

