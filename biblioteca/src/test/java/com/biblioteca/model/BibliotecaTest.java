package com.biblioteca.model;

import com.biblioteca.model.Biblioteca;
import com.biblioteca.model.Libro;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;

    // Metodo che viene eseguito prima di ogni test per inizializzare gli oggetti
    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954); // Assumo che la classe Libro esista
        libro2 = new Libro("1984", "George Orwell", 1949);
    }

    // Test per il metodo aggiungi
    @Test
    public void testAggiungiLibro() {
        biblioteca.aggiungi(libro1);
        assertEquals(1, biblioteca.dimensione());
        assertEquals(libro1, biblioteca.get(0));
    }

    // Test per aggiungere oltre la capacità (anche se il codice attuale non lo gestisce esplicitamente)
    @Test
    public void testAggiungiOltreCapacita() {
        for(int i = 0; i < 100; i++) {
            biblioteca.aggiungi(new Libro("Titolo" + i, "Autore" + i, 2000 + i));
        }
        int dimensioneIniziale = biblioteca.dimensione();
        biblioteca.aggiungi(libro1);
        assertEquals(dimensioneIniziale, biblioteca.dimensione()); // Non dovrebbe aumentare
    }

    // Test per il metodo rimuovi
    @Test
    public void testRimuoviLibro() {
        biblioteca.aggiungi(libro1);
        biblioteca.aggiungi(libro2);
        biblioteca.rimuovi(0);
        assertEquals(1, biblioteca.dimensione());
        assertEquals(libro2, biblioteca.get(0));
    }

    // Test per rimuovi con indice non valido
    @Test
    public void testRimuoviIndiceNonValido() {
        biblioteca.aggiungi(libro1);
        int dimensioneIniziale = biblioteca.dimensione();
        biblioteca.rimuovi(-1); // Indice negativo
        biblioteca.rimuovi(1);  // Indice oltre size
        assertEquals(dimensioneIniziale, biblioteca.dimensione());
    }

    // Test per il metodo dimensione
    @Test
    public void testDimensione() {
        assertEquals(0, biblioteca.dimensione());
        biblioteca.aggiungi(libro1);
        assertEquals(1, biblioteca.dimensione());
        biblioteca.aggiungi(libro2);
        assertEquals(2, biblioteca.dimensione());
    }

    // Test per il metodo get
    @Test
    public void testGet() {
        biblioteca.aggiungi(libro1);
        assertEquals(libro1, biblioteca.get(0));
    }

    // Test per get con indice non valido
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetIndiceNonValido() {
        biblioteca.get(0); // Nessun elemento presente
    }
}
