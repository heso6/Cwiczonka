package Lambdy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
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




        for (String a : list) {
//            System.out.println(a);
        }
        list.forEach((s) -> System.out.println(s));

//Sortowanie alfabetycznie
        Collections.sort(list,(String a, String a1) -> (a.compareTo(a1)));
        System.out.println("Posortowane alfabetycznie: ");
        for (String sort : list){
            System.out.println(sort);
        }

    }
}


