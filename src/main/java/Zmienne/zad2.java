package Zmienne;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-16.
 */
public class zad2 {


    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("zmienna a to " + a);
        System.out.println("zmienna b to " + b);
    }


}
