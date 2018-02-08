package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-17.
 */
public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("liczby sa rowne");
        } else {
            System.out.println("liczny nie sa rowne");
        }
    }
}
