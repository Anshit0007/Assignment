package Collection;
import java.util.*;

class Employee implements Comparable<Employee> {
    Double age;
    Double salary;
    String name;

    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String getFirstName() {
        String[] parts = name.split(" ");
        return parts[0];
    }

    public String getLastName() {
        String[] parts = name.split(" ");
        if (parts.length > 1) {
            return parts[1];
        } else {
            return "";
        }
    }

    @Override
    public int compareTo(Employee other) {
        int firstNameCompare = this.getFirstName().compareTo(other.getFirstName());
        if (firstNameCompare != 0) {
            return firstNameCompare;
        } else {
            return this.getLastName().compareTo(other.getLastName());
        }
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}

public class Question2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(25.0, 40000.0, "Ankit Sharma"));
        employees.add(new Employee(30.0, 35000.0, "Raj Verma"));
        employees.add(new Employee(28.0, 45000.0, "Ankit Singh"));
        employees.add(new Employee(26.0, 30000.0, "Kiran Rao"));

        System.out.println("Sorted by Name (default):");
        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nSorted by Salary:");
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.salary.compareTo(e2.salary);
            }
        });
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

