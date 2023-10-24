package org.lessons.library;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci quanti libri vuoi inserire");
        int numeroLibri = Integer.parseInt(scanner.nextLine());
        Libro[] libroLista =  new Libro[numeroLibri];
        for (int i = 0; i < libroLista.length; i++) {
            while (true){
                try {
                    System.out.println("Iserisci il titolo ");
                    String titoloLibro = scanner.nextLine();
                    System.out.println("Inserisci il numero di pagine");
                    int numeroPagine = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci Autore");
                    String autoreLibro = scanner.nextLine();
                    System.out.println("Inserisci Editore");
                    String editoreLibro = scanner.nextLine();
                    Libro libro = new Libro(titoloLibro,numeroPagine,autoreLibro,editoreLibro);
                    libroLista[i] = libro;
                    System.out.println("Hai aggiunto un libro " + (i+1));
                    break;
                }catch (IllegalArgumentException e) {
                    System.out.println("Errore ci sono alcuni parametri non validi" );
                }

            }
        }
        System.out.println(Arrays.toString(libroLista));
        scanner.close();
    }
}
