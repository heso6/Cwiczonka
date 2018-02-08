package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-19.
 */
public class zad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int silnia = 1;
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            silnia *= i;
            System.out.println("I wynosi: " + i + " number wynosi " + silnia);
        }
        System.out.println("silnia dla liczby " + number + " to: " + silnia);
    }
}