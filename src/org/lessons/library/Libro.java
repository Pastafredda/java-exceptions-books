package org.lessons.library;

public class Libro {
    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;

    public Libro(String titolo, int numeroPagine, String autore, String editore) throws IllegalArgumentException{
        if (titolo == null || titolo.trim().isEmpty()){
            throw new IllegalArgumentException("Titolo non valido");
        }
        if (numeroPagine <= 0){
            throw new IllegalArgumentException("Numero di pagine non valido");
        }
        if (autore == null || autore.trim().isEmpty()){
            throw new IllegalArgumentException("Autore non valido");
        }
        if ( editore == null || editore.trim().isEmpty()){
            throw new IllegalArgumentException("Editore non valido");
        }
        this.titolo= titolo;
        this.numeroPagine= numeroPagine;
        this.autore= autore;
        this.editore= editore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
        if (titolo == null || titolo.trim().isEmpty()){
        throw new IllegalArgumentException("Titolo non valido");
        }
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
        if (numeroPagine <= 0 ){
        throw new IllegalArgumentException("Numero di pagine non valido");
        }

    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
        if (autore == null || autore.trim().isEmpty()){
        throw new IllegalArgumentException("Autore non valido");

        }

    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
        if (editore == null || editore.trim().isEmpty()){
        throw new IllegalArgumentException("Editore non valido");
        }

    }

    @Override
    public String toString() {
        return "Libro{" +
               "titolo" + titolo +
                ", Numero di pagine " + numeroPagine +
                ", Autore " + autore +
                ", Editore " + editore +
                "}";
    }
}
