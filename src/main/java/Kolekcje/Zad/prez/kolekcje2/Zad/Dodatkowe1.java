package Kolekcje.Zad.prez.kolekcje2.Zad;

import java.util.ArrayList;
import java.util.List;

public class Dodatkowe1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("pawel");
        list.add("roman");
        list.add("pawel");
        list.add("anna");
        list.add("roman");
        list.add("zbigniew");


        List<String> uniqList = new ArrayList<>();
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

// Inna wersja tego programu!
//
//        new Dodatkowe1();
//
//                }
//
//public Dodatkowe1() {
//        List<String> list = new ArrayList<>();
//        list.add("pawel");
//        list.add("roman");
//        list.add("pawel");
//        list.add("anna");
//        list.add("roman");
//        list.add("zbigniew");
//        System.out.println("ma duplikaty? " + "(" + haveDuplicates(list) + ")");
//        }
//
//public boolean haveDuplicates(List<String> list) {
//
//        for (int i = 0; i < list.size(); i++) {
//        String local = list.get(i);
//        for (int a = i; a < list.size(); a++) {
//        if (local.equals(list.get(a))) {
//        return true;
//        }
//        }
//
//
//        }
//        return false;
//        }
//        }