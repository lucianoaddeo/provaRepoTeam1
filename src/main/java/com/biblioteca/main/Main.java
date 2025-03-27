package com.biblioteca.main;
import com.biblioteca.model.Libro;
import com.biblioteca.model.Biblioteca;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(); // Creiamo un'istanza di Biblioteca
        String[] elenco = biblioteca.elencoLibri(); // Recuperiamo l'elenco dei libri

        System.out.println("L'elenco dei libri disponibili: " + Arrays.toString(elenco));
        Libro libro1 =new Libro("Quello che so di te", "Nadia Terranova", 2025,  9788823521234L);
        Libro libro2 = new Libro("Fratellino" ,"di Ibrahima Balde e Amets",2025,  9788807895678L);
        Libro libro3 = new Libro("Macroeconomia","N. Gregory Manki",2016, 9788880085096L);
        Libro libro4 = new Libro("Il nome della rosa", " Umberto Eco", 1980,  9788845240000L);
        Libro libro5 = new Libro( "Un mondo nuovo", "Liz Braswell" , 2015, 9781788107686L);
        biblioteca.aggiungi(libro1);
        biblioteca.aggiungi(libro2);
        biblioteca.aggiungi(libro3);
        biblioteca.aggiungi(libro4);
        biblioteca.aggiungi(libro5);

    }
}
