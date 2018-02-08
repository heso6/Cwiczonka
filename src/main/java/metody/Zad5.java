package metody;

public class Zad5 {
    public static void main(String[] args) {

        System.out.println(pitagorasNumbers(3, 4, 5));
    }

    static boolean pitagorasNumbers(int a, int b, int c) {

        if ((a * a) + (b * b) == (c * c)) {
            return true;
        } else
            return false;
    }

}
