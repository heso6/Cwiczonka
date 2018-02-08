package Tablice;

/**
 * Created by Płaszczka on 2016-11-25.
 */
public class zad6 {
    public static void main(String[] args) {

        int[] arrayOfInt = {1, 3, 2, 6};


        for (int i = 0; i < arrayOfInt.length; i++) {
            int sum = 0;
            for (int o = i; o < arrayOfInt.length; o++) {
                sum += arrayOfInt[o];

            }
            System.out.println(sum + " ");
        }
    }
}
