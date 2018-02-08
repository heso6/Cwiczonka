package metody;

public class Zad12 {
    public static void main(String[] args) {
        Zad12 task = new Zad12();

        System.out.println(task.getMaxDividers());
    }

    public int getMaxDividers() {
        int[] arrayOfAnswer = new int[10000]; // tworzy tablice pomocnicza o wielkosci 10000.

        for (int i = 2; i < 10000; i++) { // przelatuje petla pomiedzy liczbami 2 i 10000
            arrayOfAnswer[i] = mathStuff(i); //  nastepnie do kazdej liczby z tablicy przypisuje jej dana liczbe
            // dzielników dzieki wykorzystaniu funkcji z zad 11
        }
        // prosta metoda do wyznaczenia maximum dzielnikow dzielnikow tej tablicy
        int max = 0;
        int indexTemp = 0;
        for (int i = 0; i < arrayOfAnswer.length; i++) {
            // if do wyznaczenia maximum
            if (max < arrayOfAnswer[i]) {
                max = arrayOfAnswer[i];
                indexTemp = i;
            }
        }
        System.out.print(max + " dzielniki ma liczba "); //drukuje ilosc dzielnikow
        return indexTemp; // zwraca liczbe, ktora ma najwieksza liczbe dzielnikow
    }

    public int mathStuff(int a) {

        // Funkcja z zad 11, która dla liczby 'a' wyliczna nam liczbe dzielników tej liczby

        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                counter++;
        }

        // System.out.println("Liczba dzielników liczby " + a + " to " + counter);
        return counter;
    }

}

