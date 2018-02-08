package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-19.
 */
public class zad13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 1; i < name.length(); i += 2) {
            System.out.println(name.charAt(i) + " ");
        }
    }
}