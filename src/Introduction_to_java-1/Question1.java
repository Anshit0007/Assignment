import java.util.*;
public class Question1 {
    static String firstName;
    static String lastName;
    static int age = 30;

    static {
        firstName = "Anshit";
        System.out.println("First Name from static block: " + firstName);
    }

    static void printLastName() {
        lastName = "Kumar";
        System.out.println("Last Name from static method: " + lastName);
    }
    public static void main(String[] args) {
        printLastName();
        System.out.println("Age from static variable: " + age);
        }
}
