package Klasy.Zad4;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Pawel", "Lukaszewski", 1991, 2);
        Employee employee1 = new Employee("Marzenka", "Kowalska", 1989, 4);
        Employee employee2 = new Employee("Jarek", "Seba", 1995, 0.5);

        System.out.println(employee.getName() + " - " + employee.getSurname() + " - " + employee.getBirthYear() + " - " + employee.getSeniority());
        System.out.println(employee1.getName() + " - " + employee1.getSurname() + " - " + employee1.getBirthYear() + " - " + employee1.getSeniority());
        System.out.println(employee2.getName() + " - " + employee2.getSurname() + " - " + employee2.getBirthYear() + " - " + employee2.getSeniority());
    }


}
