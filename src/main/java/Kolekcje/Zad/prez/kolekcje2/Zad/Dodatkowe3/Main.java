package Kolekcje.Zad.prez.kolekcje2.Zad.Dodatkowe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Pan Tadeusz", 400, 6050));
        bookList.add(new Book("Andrzej bonifacy", 4005, 100));
        bookList.add(new Book("Bernigiusz diabeł", 45, 20));
        bookList.add(new Book("Cecylia i jej psy", 800, 1500));
        bookList.add(new Book("Zaborowsi", 780, 6));
        bookList.add(new Book("Jedrzejczyk", 500, 900));
        bookList.add(new Book("Szymuszowski", 459, 600));

        Collections.sort(bookList);


        System.out.println("posortowane elementy po tytule:" + "\n");

        for (Book booksList : bookList) {
            System.out.println(booksList);
        }

        System.out.println("\n" + "posortowanie po tytule odwrotnie " + "\n");

        Collections.reverse(bookList);
        for (Book booksList : bookList) {
            System.out.println(booksList);
        }

        System.out.println("\n" + "posortowane elementy po cenie:" + "\n");

        bookList.sort(Comparator.comparing(Book::getPrice));


        for (Book booksList : bookList) {
            System.out.println(booksList);
        }

        System.out.println("\n" + "posortowane elementy po ilosci stron:" + "\n");

        bookList.sort(Comparator.comparing(Book::getPages));


        for (Book booksList : bookList) {
            System.out.println(booksList);
        }

//        Collections.sort(bookList,new CompareBypages());
//
//        System.out.println("\n" + "Posortowanie stron jeszcze raz ");
//        for (Book booksList : bookList) {
//            System.out.println(booksList);
//        }
//
//
//
//
//    }
//      dokladanie comparatora, aby posortowac po innym elemencie
//    public static class CompareBypages implements Comparator<Book> {
//
//
//        @Override
//        public int compare(Book o1, Book o2) {
//            if (o1.getPrice() > o2.getPrice()) {
//                return -1;
//            } else if (o1.getPrice() == o2.getPrice()) {
//                return 0;
//            }
//            return 1;
//        }

    }
}