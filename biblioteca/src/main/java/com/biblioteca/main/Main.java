package com.biblioteca.main;

import com.biblioteca.model.Biblioteca;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(); // Creiamo un'istanza di Biblioteca
        String[] elenco = biblioteca.elencoLibri(); // Recuperiamo l'elenco dei libri

        System.out.println("L'elenco dei libri disponibili: " + Arrays.toString(elenco));
    }
}