package String_petle;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2017-02-27.
 */
public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                counter++;
            }
        }
        System.out.println(counter);

        /*
        counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i)) && Character.isLowerCase(word.charAt(i))) {
                counter++;
            }

        }
        System.out.println(counter);*/

    }
}