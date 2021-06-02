package com.star.java.oop.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Finally {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("input.txt");
        try {
            //cod sa citim fisierul
            int read = inputStream.read();//arunca exceptie
            throw new IllegalArgumentException("nskjania");
//            System.out.println("try");
        } catch (IOException ex) {
            //handle exception
            inputStream.close();
            System.out.println("catch");
        } finally {
            System.out.println("FInally");
            inputStream.close();//eu, developerul
        }


        //try-with-resources
        //JVM va garanta inchiderea automata a tuturor resurselor create astfel, la finalul lui try
        try (InputStream is = new FileInputStream("input.txt");
             InputStream is3 = new FileInputStream("input.txt")) { //tbs a aiba neaparat metoda close() (de la java.io.Closeable sau java.lang.AutoCloseable)

            InputStream is2 = new FileInputStream("input.txt");//nu va fi inchis
            //cod sa citim fisierul
            int read = is.read();//arunca exceptie
            throw new IllegalArgumentException("nskjania");
//            System.out.println("try");
        } catch (IOException ex) {
            //handle exception
            System.out.println("catch");
        }
    }

    private static void dangerousMethod() {//declare
        try (InputStream inputStream = new FileInputStream("input.txt")) {
            //read file
        } catch (IOException e) {

        }
    }
}


