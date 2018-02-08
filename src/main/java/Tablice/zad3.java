package Tablice;

/**
 * Created by Płaszczka on 2016-11-24.
 */
public class zad3 {
    public static void main(String[] args) {

        int[] arrayOfInt = {1, 1, 5, 12, 141, 1, 5, 8, 2, 629, 313, 9, 9, 9, 9, 9, 9, 2, 2, 223, 2};
        int[] arrayOfResponse = new int[arrayOfInt.length]; // tablica ktora bedzie przetrzymywała ilosc powtorzen danej liczby

        // zapisujemy sobie do odrebnej tablicy wynik grupowania danych
        for (int i = 0; i < arrayOfInt.length; i++) { //przelatuje przez wszystkie elementy tablicy
            int counter = 0;
            for (int number : arrayOfInt) { //pobiera element na ktorym jest pierwsza petla
                if (arrayOfInt[i] == number) counter++; //zlicza ile jest powtorzeń
            }


            arrayOfResponse[i] = counter; //zlicza ile razy wystapiła dana liczba
            System.out.println(arrayOfInt[i] + " " + "->" + " " + arrayOfResponse[i]);


        }//szukamy liczby ktora sie najczesciej powtarza
        int tempo = Integer.MIN_VALUE;
        int tempoindex = 0;
        for (int i = 0; i < arrayOfResponse.length; i++) {
            if (arrayOfResponse[i] > tempo) { // wyszukiwanie najwiekszej wartosci
                tempo = arrayOfResponse[i];
                tempoindex = i;
            }
        }
        System.out.println("najczesciej wystepujaca liczba to: " + arrayOfInt[tempoindex]);
    }
}
