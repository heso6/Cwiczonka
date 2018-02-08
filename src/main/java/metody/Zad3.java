package metody;

public class Zad3 {
    public static void main(String[] args) {
        Zad3 task = new Zad3(); //Referencja do naszej klasy pozwalajaca nam odwłoanie sie do metody bez static
        System.out.println(task.multiply(10, 5));
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
