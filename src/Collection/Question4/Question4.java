package Collection.Question4;
import java.util.*;

class Employee {
    String name;
    int age;
    String designation;

    Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return this.name.equals(e.name) && this.age == e.age && this.designation.equals(e.designation);
    }

    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    public String toString() {
        return name + ", " + age + ", " + designation;
    }
}

public class Question4 {
    public static void main(String[] args) {
        HashMap<Employee, Double> map = new HashMap<>();

        Employee e1 = new Employee("Amit", 28, "Developer");
        Employee e2 = new Employee("Ravi", 32, "Tester");
        Employee e3 = new Employee("Sneha", 30, "Manager");

        map.put(e1, 45000.0);
        map.put(e2, 40000.0);
        map.put(e3, 60000.0);

        for (Map.Entry<Employee, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
