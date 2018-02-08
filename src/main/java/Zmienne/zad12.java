package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-19.
 */
public class zad12 {

    public static void main(String[] args) {
        System.out.println("wpisz imie!");
        String name = new Scanner(System.in).next();
        StringBuilder nameBuilder = new StringBuilder(name);

        System.out.println("wypisane imie to: " + name);


        System.out.println("A odwrocone imie to: " + nameBuilder.reverse());

    }
}