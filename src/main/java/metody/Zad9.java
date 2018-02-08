package metody;

public class Zad9 {
    public static void main(String[] args) {
        System.out.println(ifNaturalNumber(9));
    }

    public static boolean ifNaturalNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number == (i * i * i)) {
                System.out.println(" liczba " + number + " jest sześćianem liczby " + i);
                return true;

            }

        }
        return false;
    }


}

