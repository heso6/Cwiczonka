package Klasy.Zad4;

public class Employee {

    private String name;
    private String surname;
    private int birthYear;
    private double seniority;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getSeniority() {
        return (double) seniority;
    }

    public Employee(String name, String surname, int birthYear, double seniority) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.seniority = seniority;


    }

}
