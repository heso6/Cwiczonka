package Klasy.Zad7;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender;
    //static ArrayList<String> fullName = new ArrayList<String>();
    static List<String> fullName = new ArrayList<String>();

    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        fullName.add(name + " " + surname);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static List<String> getFullName() {
        return fullName;
    }

    public static void setFullName(List<String> fullName) {
        Person.fullName = fullName;
    }

    public static List<String> getAllPeople() {

        Person person = new Person("Paweł", "Lukaszewski", 21, 'm');
        Person person1 = new Person("Thomas", "Lukaszewski", 21, 'm');
        Person person2 = new Person("Romo", "Lukaszewski", 21, 'm');

        return fullName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}