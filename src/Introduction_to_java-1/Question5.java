class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    // Default constructor
    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 0;
        this.designation = "Undefined";
    }

    // Parameterized constructor
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    // Copy constructor
    public Employee(Employee other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.designation = other.designation;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString() {
        return "Employee [Name: " + firstName + " " + lastName +
                ", Age: " + age +
                ", Designation: " + designation + "]";
    }
}


public class Question5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // Default constructor
        Employee emp2 = new Employee("Riya", "Singh", 30, "Manager"); // Parameterized constructor
        Employee emp3 = new Employee(emp2); // Copy constructor

        emp1.setAge(25);
        emp1.setDesignation("Intern");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
