package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-19.
 */
public class zad14 {

    public static void main(String[] args) {

        String secretPassword = "akademia";
        String userPassword;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("podaj poprawne haslo: ");
            userPassword = scanner.next();

        } while
                (!userPassword.equals(secretPassword));

        System.out.println("podales poprawne haslo!!");

    }
}



