package com.biblioteca.model;


// Classe che rappresenta un libro nella biblioteca
class Libri {
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    private long ISBN;

    // Costruttore di default
    public Libri() {
        titolo= "titolo";
        autore= "sconoscuto";
        annoPubblicazione= 0000;
        ISBN=0000000000000000L;
    }

    // Costruttore parametrizzato
    public Libri(String titolo, String autore, int annoPubblicazione, long  ISBN) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.ISBN = ISBN;
    }

    // Getter e Setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long  ISBN) {
        this.ISBN = ISBN;
    }

    // Metodo toString per stampare i dettagli del libro in modo leggibile
    @Override
    public String toString() {
        return "Libro{" +
                "Titolo='" + titolo + '\'' +
                ", Autore='" + autore + '\'' +
                ", Anno di Pubblicazione=" + annoPubblicazione +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
public class Libro {
    public static void main(String[] args) {
        Libri libro1 =new Libri("Quello che so di te", "Nadia Terranova", 2025,  9788823521234L);
        Libri libro2 = new Libri("Fratellino" ,"di Ibrahima Balde e Amets",2025,  9788807895678L);
        Libri libro3 = new Libri("Macroeconomia","N. Gregory Manki",2016, 9788880085096L);
        Libri libro4 = new Libri("Il nome della rosa", " Umberto Eco", 1980,  9788845240000L);
        Libri libro5 = new Libri( "Un mondo nuovo", "Liz Braswell" , 2015, 9781788107686L);
//stampa i libri
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
    }
}