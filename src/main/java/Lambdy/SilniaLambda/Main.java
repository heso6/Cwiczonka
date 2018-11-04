package Lambdy.SilniaLambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        SilniaInterface exaSilnia = a -> {
            int number = 1;
            for (int i = 1; i <= a; i++) {
                number *= i;
            }
            return number;
        };
//        System.out.println(exaSilnia.silniaExample(5));


        List<String> names = Arrays.asList("rafał", "anka", "beata", "zbigniew", "andrzej", "thing");

        names.stream().sorted().forEach(lambdaNames -> System.out.println(lambdaNames));
//        blablablabla
        int dupa = 1234;
String dupcia = "anna";

//?bavavasvsad
//        dsadasdasdsadasd
    }
}