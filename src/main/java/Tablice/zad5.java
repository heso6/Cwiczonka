package tablice;

/**
 * Created by Płaszczka on 2016-11-25.
 */
public class zad5 {
    public static void main(String[] args) {
        int[] arrayOfInt = {3, 12, 51, 213, 12, 567, 2};
        int min = arrayOfInt[0], max = arrayOfInt[0];

        for (int number : arrayOfInt) {
            if (min > number) min = number; //jesli dany min jest wiekszy od kolejnej liczby pobranej z  ''number''
            //tzn. ze nie jest to minimalna liczba i dobierana jest kolejna liczba
            // az do momentu kiedy znajdzie liczbe minimalna tablicy
            if (max < number) max = number;
        }
        System.out.println("liczba max to: " + max + " " + "liczba min to: " + min);
    }
}
