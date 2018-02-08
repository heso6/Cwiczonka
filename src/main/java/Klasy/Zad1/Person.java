package Klasy.Zad1;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String gender;


    // public Person() {}

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {

        // Stworzenie obiektu na pustym konstruktorze z uzyciem setterow (ale trzeba stworzyc do tego settery w kodzie)
       /* Person object = new Person();
        object.setName("Paweł");
        object.setSurname("łuykaszewski");
        object.setAge(26);
        object.setGender("Male");*/

        // Stworzenie kodu na innym konstruktorze (korzystajac z tej samej klasy), ale bez setterow
        Person object1 = new Person("pawel", "Lukaszewski", 26, "Male");


        System.out.println(object1.getSurname());
    }
}

