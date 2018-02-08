package String_petle;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-19.
 */
public class zad7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                counter++;
        }
        System.out.println("Liczba dzielników liczby " + number + " to " + counter);
    }

}
