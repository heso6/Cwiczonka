package String_petle;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-17.
 */
public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toLowerCase();

        if (name.equals("kuba") || name.equals("barnaba")) {
            System.out.println("imie jest meskie");

        } else if (name.endsWith("a")) {
            System.out.println("imie jest żeńskie");
        } else {
            System.out.println("imie jest męskie");
        }
    }
}
