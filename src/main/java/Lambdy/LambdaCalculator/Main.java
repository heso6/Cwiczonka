package Lambdy.LambdaCalculator;

public class Main {
    public static void main(String[] args) {

        IntegerMath add = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath division = (a, b) -> {
            if (b == 0 || a== 0) {
                throw new ArithmeticException("nie mozna dzielic przez zero");
            }
            return a / b;
        };
        IntegerMath multiply = (a, b) -> a * b;

        System.out.println(binaryOperate(division,0,5));
    }

    private static int binaryOperate(IntegerMath lambda, int a, int b) {
        return lambda.operate(a, b);
    }
}
