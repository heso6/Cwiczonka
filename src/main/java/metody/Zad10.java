package metody;

public class Zad10 {
    public static void main(String[] args) {
        System.out.println(maxNumber(4, 6));

    }

    public static int maxNumber(int numberOne, int numberTwo) {
        String end = "koniec zadania";
        if (numberOne < numberTwo) {
            System.out.println(numberTwo + " jest wieksza od " + numberOne);

        } else {
            System.out.println(numberOne + " jest wieksza od " + numberTwo);
        }
        return 0;

    }
}
