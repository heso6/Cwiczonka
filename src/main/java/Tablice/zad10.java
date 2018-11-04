package tablice;

import java.util.Random;

/**
 * Created by Płaszczka on 2016-11-25.
 */
public class zad10 {
    public static final int ROWS = 5;
    public static final int COLUMNS = 5;

    public static void main(String[] args) {
        int[][] arrayOfInt = new int[COLUMNS][ROWS];

        Random random = new Random();// uzywcie klasy do wygenorwania i wypełnienia tablicy randomowymi liczbami

        //generuje dane
        for (int i = 0; i < arrayOfInt.length; i++) {
            for (int o = 0; o < arrayOfInt[i].length; o++) {
                arrayOfInt[i][o] = random.nextInt(50); //funckja wypełnia kolumny i wiersze 49 randomowymi liczbami
            }
        }
        int sum = 0;
        //sumuje dane
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayOfInt.length; i++) {
            for (int o = 0; o < arrayOfInt[i].length; o++) {
                sum += arrayOfInt[i][o];
                if (min > arrayOfInt[i][o]) min = arrayOfInt[i][o]; //wyszukiwanie minimum
                if (max < arrayOfInt[i][o]) max = arrayOfInt[i][o]; // wyszukiwanie maximum
            }

        }
        System.out.println("wartosc max: " + max + " wartosc min " + min + " suma " + sum);
    }
}
