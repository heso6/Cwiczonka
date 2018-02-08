package metody;

public class Zad13 {
    public static void main(String[] args) {
        Zad13 task = new Zad13();
        System.out.println(task.mathProblem(3, 2));
    }

    public int mathProblem(int a, int b) {
        double j = Math.pow(a, b); // a = liczba, b = potega do jakiej wezmiemy liczbe

        return (int) j;
    }
}
