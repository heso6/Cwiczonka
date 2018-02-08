package Tablice;

/**
 * Created by Płaszczka on 2016-11-25.
 */
public class zad7 {
    public static void main(String[] args) {
        int[] arrayOfInt = {3, 12, 51, 213, 12, 567, 2, 21, 92};

        for (int i = 0; i < arrayOfInt.length; i++) {
            int counter = 0;
            for (int number : arrayOfInt) {
                if (number == arrayOfInt[i]) counter++;
            }
            if (counter >= 3) {
                System.out.println("tak");
                return;
            }
        }
        System.out.println("nie");
    }
}
