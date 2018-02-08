package Klasy.Zad8;


public class Main {
    public static void main(String[] args) {

        Employee person = new Employee("Paweł", "Lukaszewski", 21, 'm', 10);
        Employee person1 = new Employee("Thomas", "Lukaszewski", 21, 'm', 5600);
        Employee person2 = new Employee("Thomas", "Lukaszewski", 21, 'm', 400);

        System.out.println("Suma wszystkoch wypłat to: " + Employee.allSumSalary());

    }
}

