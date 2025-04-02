package com.biblioteca.model;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LibroTest {

    private static Libro libro;

    // Metodo di setup eseguito prima di ogni test
    @BeforeAll
    public static void setup () {
        libro = new Libro();
    }

    // Test per il costruttore di default
    @Test
    public void testCostruttoreDefault() {
        assertEquals("titolo", libro.getTitolo());
        assertEquals("sconoscuto", libro.getAutore());
        assertEquals(0000, libro.getAnnoPubblicazione());
        assertEquals(0000000000000000L, libro.getISBN());
    }

    // Test per il costruttore parametrizzato
    @Test
    public void testCostruttoreParametrizzato() {
        Libro libroParam = new Libro("Il Nome del Vento", "Patrick Rothfuss", 2007, 9788804686934L);
        assertEquals("Il Nome del Vento", libroParam.getTitolo());
        assertEquals("Patrick Rothfuss", libroParam.getAutore());
        assertEquals(2007, libroParam.getAnnoPubblicazione());
        assertEquals(9788804686934L, libroParam.getISBN());
    }

    // Test per i getter e setter del titolo
    @Test
    public void testGetSetTitolo() {
        libro.setTitolo("Dune");
        assertEquals("Dune", libro.getTitolo());
    }

    // Test per i getter e setter dell'autore
    @Test
    public void testGetSetAutore() {
        libro.setAutore("Frank Herbert");
        assertEquals("Frank Herbert", libro.getAutore());
    }

    // Test per i getter e setter dell'anno di pubblicazione
    @Test
    public void testGetSetAnnoPubblicazione() {
        libro.setAnnoPubblicazione(1965);
        assertEquals(1965, libro.getAnnoPubblicazione());
    }

    // Test per i getter e setter dell'ISBN
    @Test
    public void testGetSetISBN() {
        long isbn = 9788804668237L;
        libro.setISBN(isbn);
        assertEquals(isbn, libro.getISBN());
    }

//    // Test per il metodo toString
//    @Test
//    public void testToString() {
//        Libro libroTest = new Libro("1984", "George Orwell", 1949, 9788804668237L);
//        String expected = "Libro{Titolo='1984', Autore='George Orwell', Anno di Pubblicazione=1949, ISBN='9788804668237'}";
//        assertEquals(expected, libroTest.toString());
//    }

    // Test per verificare che i valori null siano gestiti (opzionale, dipende dai requisiti)
    @Test
    public void testSetTitoloNull() {
        libro.setTitolo(null);
        assertNull(libro.getTitolo());
    }

    @Test
    public void testSetAutoreNull() {
        libro.setAutore(null);
        assertNull(libro.getAutore());
    }
}
