package Introduction_to_java_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User {
    String firstname;
    String lastname;
    int age;
    String phonenumber;

    public User(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public String toString() {
        return firstname + "," + lastname + "," + age + "," + phonenumber;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // To read user input

        try {

            FileWriter writer = new FileWriter("users.txt", true);

            while (true) {

                System.out.print("Enter First Name: ");
                String fname = sc.nextLine();

                System.out.print("Enter Last Name: ");
                String lname = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();


                User user = new User(fname, lname, age, phone);


                writer.write(user.toString() + "\n");
                writer.flush();

                System.out.println("User saved!");


                System.out.print("Do you want to continue creating users? (Type QUIT to exit): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }

            writer.close();
            System.out.println("All users saved to file. Goodbye!");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for age.");
        }
    }


}
