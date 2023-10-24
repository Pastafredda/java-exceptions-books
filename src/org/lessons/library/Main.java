package org.lessons.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci quanti libri vuoi inserire");
        int numeroLibri = Integer.parseInt(scanner.nextLine());
        Libro[] libroLista =  new Libro[numeroLibri];
        for (int i = 0; i < libroLista.length; i++) {
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

                }catch (IllegalArgumentException e) {
                    System.out.println("Errore" + " " + e.getMessage());
                }
        }
        System.out.println(Arrays.toString(libroLista));

        // provo a scrivere nel file
        FileWriter writer= null;
        try {
            writer = new FileWriter("./resources/library.txt");
            writer.write(Arrays.toString(libroLista));
            writer.close();
        } catch (IOException e) {
            System.out.println("impossibile aprire il file");
        }finally {
            try {
                if (writer != null){
                    System.out.println("Chiudo il file");
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //provo a leggere il file
        Scanner fileReader= null;
        try {
             fileReader = new Scanner(new File("./resources/library.txt"));
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file non trovato");
        }finally {
            if (fileReader != null){
                System.out.println("Chiudo il file");
                fileReader.close();
            }
        }
        scanner.close();
    }
}
