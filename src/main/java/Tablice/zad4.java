package Tablice;

/**
 * Created by Płaszczka on 2016-11-25.
 */
public class zad4 {
    public static void main(String[] args) {
        int[] arrayOfInt = {5, 5, 5, 5, 10};

        long sum = 0;
        for (int number : arrayOfInt) {
            sum += number;
        }
        System.out.println("suma: " + sum);
        System.out.println(" srednia: " + (sum / arrayOfInt.length));
    }
}

/*int sum = 0;
        int[] a = {5,-1,3,8,5,6,1,3};
        for (int arr : a)
        sum += arr;
        System.out.println("suma tablicy to " + sum);
        double arrayAverage = (double) sum / a.length;
        System.out.println("srednia arytmetyczna tablicy to " + arrayAverage);
    }
}
*/
