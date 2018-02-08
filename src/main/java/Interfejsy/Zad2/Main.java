package Interfejsy.Zad2;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Comparable> personList = new ArrayList<>();

        personList.add(new Employee("Pawel", "Lukaszewski", "Male", 26, 90500, 2.5));
        personList.add(new Employee("Anna", "Lukaszewska", "Female", 46, 8000, 7.5));
        personList.add(new Employee("Katarzyna", "Kowalska", "Female", 86, 12000, 15));
        personList.add(new Employee("Roman", "Lukaszewski", "male", 66, 0.5, 10));

        Collections.sort(personList);

        System.out.println(" Posortowane elementy: ");
        for (Comparable allPersonalList : personList) {
            System.out.println(allPersonalList);
        }

        System.out.println("- osoba z najmniejsza wypłatą: " + personList.get(0));
        System.out.println("- Osoba z najwiekszą wypłata: " + personList.get(personList.size() - 1));
    }
}
