package Klasy.Zad7;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Janek", "kowalski", 21, 'm');


        System.out.println(Person.getAllPeople().toString());
        p1.setName("Karaiby");
        System.out.println(Person.getAllPeople().toString());


    }

}