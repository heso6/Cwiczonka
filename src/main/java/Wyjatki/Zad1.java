package Wyjatki;

public class Zad1 {
    public static void main(String[] args) {


        new Zad1().devine(10, 5);


    }

    public Zad1() {
        try {
            devine(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("nie mozna dzielic przez 0");
        }
    }


    public void devine(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("nie mozna dzielic przez 0 ");
        }
        System.out.println(a / b);
    }
}
