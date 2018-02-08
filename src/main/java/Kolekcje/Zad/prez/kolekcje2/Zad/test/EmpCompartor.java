package Kolekcje.Zad.prez.kolekcje2.Zad.test;

import java.util.Comparator;

public class EmpCompartor implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Employee emp1 = (Employee) obj1;
        Employee emp2 = (Employee) obj2;

        int nameComp = emp1.getName().compareTo(emp2.getName());

        return ((nameComp == 0) ? emp1.getDepartment().compareTo(
                emp2.getDepartment()) : nameComp);
    }
}

class Employee implements Comparable {
    String department, name;

    public Employee(String finance, String department, String name) {
        this.department = department;
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[dept=" + department + ",name=" + name + "]";
    }

    public int compareTo(Object obj) {
        Employee emp = (Employee) obj;
        int deptComp = department.compareTo(emp.getDepartment());

        return ((deptComp == 0) ? name.compareTo(emp.getName()) : deptComp);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee emp = (Employee) obj;
        return department.equals(emp.getDepartment())
                && name.equals(emp.getName());
    }

    public int hashCode() {
        return 31 * department.hashCode() + name.hashCode();
    }
}