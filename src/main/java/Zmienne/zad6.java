package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-17.
 */
public class zad6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 4 == 0) {
            System.out.println("liczba jest podzielna przez 4");
        } else {
            System.out.println("liczba nie jest podzielna przez 4");
        }

    }
}
