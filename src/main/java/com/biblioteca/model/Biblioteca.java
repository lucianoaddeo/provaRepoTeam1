
package com.biblioteca.model;

import java.util.Arrays;

public class Biblioteca {
    private Libro[] dati = new Libro[100];
    private int size = 0;

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

    public String[] elencoLibri() {
        String elenco[] = {"Quello che so di te", "Fratellino", "Macroeconomia", "Un mondo nuovo", "Il nome della rosa"};
        return elenco;
    }
}
