package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-18.
 */
public class zad11 {

    public static void main(String args[]) {

        System.out.println("wpisz imie!");
        String name = new Scanner(System.in).next().toLowerCase();
        StringBuilder nameBuilder = new StringBuilder(name);
        String reversedString = nameBuilder.reverse().toString();

        if (name.equals(reversedString)) {
            System.out.println("wyraz jest palindromem");
        } else {
            System.out.println("wyraz nie jest palindromem");
        }


       /* String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("wpisz imie");
        original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("imie jest palindromem");
        else
            System.out.println("imie nie jest palindromem");*/

    }
}

