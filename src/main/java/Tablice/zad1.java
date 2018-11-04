package tablice;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-24.
 */
public class zad1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("wpisz liczby oddzielone spacja");
        String[] array = scanner.nextLine().split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
        scanner.close();
    }
}




