package Klasy.Zad5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Ford", "gówno wort", "2.0 tfsi");
        Product product2 = new Product("Honda", "szybsza niz wyglada", "2.0 v-tec");

        Guarantee guarantee1 = new Guarantee(product1, LocalDate.of(2016, 5, 21));
        Guarantee guarantee2 = new Guarantee(product2, LocalDate.of(2019, 5, 6));

        if (!guarantee1.isValid()) {
            System.out.println("Gwarancja produktu 1 skonczyła się");


        }
        if (!guarantee2.isValid()) {
            System.out.println("Gwarancja produktu 2 skonczyła się");


        }
    }
}
