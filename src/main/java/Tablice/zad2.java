package Tablice;

/**
 * Created by Płaszczka on 2016-11-24.
 */
public class zad2 {

    public static void main(String[] args) {
        int[] array = {1, -5, 54, 612, 8, 186, 7};

        int temp = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < temp)
                temp = array[i];

            System.out.println("najmniejsza liczba to " + temp);


        }
    }
}
/*
 *int[]a={5,-1,3,8,5,6,1,3};
 *
 *Arrays.sort(a);
 *System.out.println("Min value: "+a[0]);
 *System.out.println("Max value: "+a[a.length-1]);
 *}
 */