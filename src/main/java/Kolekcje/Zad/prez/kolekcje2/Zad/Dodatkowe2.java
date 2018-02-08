package Kolekcje.Zad.prez.kolekcje2.Zad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dodatkowe2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("pawel");
        list.add("roman");
        list.add("pawel");
        list.add("anna");
        list.add("roman");
        list.add("zbigniew");


        Set<String> uniqList = new HashSet<>();
        List<String> dupesList = new ArrayList<>();
        for (String a : list) {
            if (uniqList.contains(a))
                dupesList.add(a);
            else
                uniqList.add(a);


        }
        System.out.println(dupesList.size() + " uniqe words: " + uniqList);
        System.out.println(dupesList.size() + " dupes List words: " + dupesList);
    }

}

