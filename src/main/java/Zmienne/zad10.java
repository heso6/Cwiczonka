package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-17.
 */
public class zad10 {
    public static void main(String[] args) {
        String name = new Scanner(System.in).next();
        int length = name.length();
        System.out.println(name.charAt(length - 1));
    }
}
