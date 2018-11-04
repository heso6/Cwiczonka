package Lambdy.Strumienie;

import Lambdy.LambdaCalculator.IntegerMath;
import com.beust.jcommander.internal.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        streamsOperations();
    }


    private static void streamsOperations() {
        List<String> list = new ArrayList<>();
        list.add("truskawka");
        list.add("agrest");
        list.add("dynia");
        list.add("jablko");
        list.add("banan");
        list.add("ananas");


        //        Integer[] a = {5, 10, 15, 20};
//        List<Integer> numbers = Arrays.asList(a);
//
//        numbers.forEach((s) -> System.out.println(s + 5));
//
//        for (int[] s : numbers) {
//            System.out.println(s);
//        }
//        list.forEach((s) -> System.out.println(s));
//
//Sortowanie alfabetycznie
//        Collections.sort(list,(String a, String a1) -> (a.compareTo(a1)));
//        System.out.println("Posortowane alfabetycznie: ");
//       for (String sort : list){
//           System.out.println(sort);
//       }
//wypisuje wyrazy zaczynajace sie na a
//        list.stream().filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));
//        list.stream().filter(s -> s.startsWith("t")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

//        list.stream().filter(s -> s.startsWith("a")).sorted().forEach(s -> System.out.println(s));
//        list.stream().filter(s -> s.startsWith("t")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

//        long startTime = System.nanoTime();
//        for (String s : list) {
//            System.out.println(s);
//        }
//        long stopTime = System.nanoTime();
//
//        long startTime1 = System.nanoTime();
//
//        list.forEach(s -> System.out.println(s));
//
//        long stopTime1 = System.nanoTime();
//
//        System.out.println("for: " + (stopTime - startTime) + " lambda: " + (stopTime1 - startTime1));
//        System.out.println("tyle razy lambda jest wolniejsza od fora: " + (stopTime1 - startTime1) / (stopTime - startTime));
    }
}
