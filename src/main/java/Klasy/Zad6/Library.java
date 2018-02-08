package Klasy.Zad6;

public class Library {
    public static void main(String[] args) {

        Book book = new Book("Pan Tadeusz", "Adam Mickiewicz", 500);
        Book book1 = new Book("Ogniem i mieczem", "Sienkiewicz", 400);


        System.out.println(book.getAuthor() + " | " + book.getName() + " - " + book.getPages() + " str.");
        System.out.println(book1.getAuthor() + " | " + book1.getName() + " - " + book1.getPages() + " str.");
    }
}
