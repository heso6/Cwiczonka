package metody;

public class Zad2 {
    public static void main(String[] args) {
        Zad2 task = new Zad2(); //Referencja do naszej klasy pozwalajaca nam odwłoanie sie do metody bez static
        System.out.println(task.substrack(5, 2));

    }

    private int substrack(int a, int b) {
        return a - b;
    }
}
