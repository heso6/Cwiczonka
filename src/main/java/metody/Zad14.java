package metody;

public class Zad14 {
    public static void main(String[] args) {
        Zad14 task = new Zad14();
        System.out.println(task.euclidesAlgorithm(20, 10));
    }

    public int euclidesAlgorithm(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return a;
    }
}
