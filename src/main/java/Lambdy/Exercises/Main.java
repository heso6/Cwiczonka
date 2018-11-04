package Lambdy.Exercises;

public class Main {

    public static void main(String[] args) {

        CalculatorInterface sum = (a, b) -> a + b;
        CalculatorInterface minus = (a, b) -> a - b;
        CalculatorInterface dzielenie = (a, b) -> {
            if (a == 0 || b == 0) {
                throw new ArithmeticException("nie mozna dzielic przez zero");
            }
            return a / b;
        };
        CalculatorInterface mnozenie = (a, b) -> a * b;

//        System.out.println(binaryOperate(dzielenie, 4,0));
        System.out.println(dzielenie.getName(4,2));
    }

    private static int binaryOperate(CalculatorInterface lambda, int a, int b) {

        return lambda.getName(a, b);
    }
}
