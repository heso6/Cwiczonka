package Interfejsy.Zad2;

public class Employee extends Person implements Comparable<Employee> {

    private double salary;
    private double workExperience;

    public Employee(String name, String surname, String gender, int age, double salary, double workExperience) {
        super(name, surname, gender, age);
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }


    @Override
    public int compareTo(Employee o) {

        if (this.salary == o.salary) {
            return 0;
        }
        if (this.salary > o.salary) {

            return -1;


        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + salary;
    }
}

