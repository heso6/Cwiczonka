package metody;

public class Zad7 {
    public static void main(String[] args) {
        //Zad7 task = new Zad7();
        System.out.println(numbers(4));
    }

    public static boolean numbers(int a) {
        for (int i = 0; i < a; i++) {
            if (a == i * i) {
                return true;
            }
        }
        return false;
    }


}
