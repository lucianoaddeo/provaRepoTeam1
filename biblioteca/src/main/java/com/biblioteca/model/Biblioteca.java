package com.biblioteca.model;

import java.util.Arrays;

class Inventario {

    // Metodo che restituisce un array di libri
    public String[] elencoLibri() {
        String elenco[] = {"Quello che so di te", "Fratellino", "Macroeconomia", "Un mondo nuovo", "Il nome della rosa"};
        return elenco;
    }
}

public class Biblioteca {
    public static void main(String[] args) {

        Inventario biblioteca = new Inventario(); // Creiamo un'istanza di Biblioteca
        String[] elenco = biblioteca.elencoLibri(); // Recuperiamo l'elenco dei libri

        System.out.println("L'elenco dei libri disponibili: " + Arrays.toString(elenco));
    }
}