package Kolekcje.Zad.prez.kolekcje2.Zad.Dodatkowe3;

public class Book implements Comparable<Book> {

    private String title;
    private int pages;
    private int price;


    public Book(String title, int pages, int price) {
        this.title = title;
        this.pages = pages;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Pages - " + pages + ", Price - " + price;
    }


    @Override
    public int compareTo(Book o) {
        int checkTitle = title.compareTo(o.title);
        return checkTitle;
    }


}



