package metody;

public class Zad11 {
    public static void main(String[] args) {
        Zad11 task = new Zad11();
        System.out.println(task.mathStuff(4));
    }

    private int mathStuff(int a) {
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                counter++;
        }
        System.out.print("Liczba dzielników liczby " + a + " to ");
        return counter;
    }

}



