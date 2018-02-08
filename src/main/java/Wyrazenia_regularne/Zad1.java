package Wyrazenia_regularne;

import java.util.regex.Pattern;

public class Zad1 {
    public static void main(String[] args) {


        System.out.println(Pattern.matches(".{3}\\d{3}", "qwE123"));
        System.out.println(Pattern.matches("\\d+", "123213213"));
        System.out.println(Pattern.matches("[a-zA-Z]+", "asdasdasdasdas"));
        System.out.println(Pattern.matches("\\w+", "16sda54ryy"));
        System.out.println(Pattern.matches("\\d{5}", "12345"));
        System.out.println(Pattern.matches("[j].*", "jadasdasdasasd"));
        System.out.println(Pattern.matches("[j].*[u]", "jdasdasdsadu"));
        System.out.println(Pattern.matches("\\p{Upper}.*", "Padasdasdasdasd"));
        System.out.println(Pattern.matches(".*\\s.*", "asdasda asdasda"));

        //"[7-9]\\d{2}[\\s-]?\\d{3}[\\s-]?\\d{3}" - bardziej uniwersalny nr. tel
        System.out.println(Pattern.matches("[7-9]\\d{8}", "826479097"));
        System.out.println(Pattern.matches("([a-zA-Z]{2,3}\\s)(\\d{4}\\s){5}\\d{4}", "AbC 8200 0008 3001 0021 1695 0001"));
        System.out.println(Pattern.matches("\\d{2}-\\d{3}", "22-300"));

        System.out.println(Pattern.matches("[A-za-z]+[\\s]?[A-za-z]+", "asdasda sdasdas"));
    }
}
