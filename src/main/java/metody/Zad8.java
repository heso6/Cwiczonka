package metody;

public class Zad8 {
    public static void main(String[] args) {
        Zad8 task = new Zad8();
        System.out.println(task.firstNumber(4));

    }

    boolean firstNumber(int liczba) {
        if (liczba == 1) {
            return false;
        }
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        System.out.println("liczba " + liczba + " jest liczba pierwsza");
        return true;
    }
}