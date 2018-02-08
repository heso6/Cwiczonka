package Klasy.Zad8;


import java.util.ArrayList;

public class Employee {

    private String name;
    private String surname;
    private int birthYear;
    private double seniority;
    private int salary;
    static ArrayList<Integer> sumSalary = new ArrayList<Integer>();


    public Employee(String name, String surname, int birthYear, double seniority, int salary) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.seniority = seniority;
        this.salary = salary;
        sumSalary.add(salary);

    }


    public static int allSumSalary() {

        int allSalary = 0;
        for (Integer nextSalary : sumSalary) {
            allSalary += nextSalary;
        }

        return allSalary;
    }
}




