package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-17.
 */
public class Zad5 {

    public static void main(String[] args) {
        Scanner agescanner = new Scanner(System.in);
        int age = agescanner.nextInt();
        if (age >= 18) {
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("nie jestes pelnoletni");
        }
    }
}
