import java.util.*;
public class Question3 {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Static method to calculate circumference
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double radius;
        System.out.println("******* Menu *******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit");
        System.out.print("Choose an option (1-3): ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                radius = sc.nextDouble();
                System.out.println("Area of Circle: " + area(radius));
                break;
            case 2:
                System.out.print("Enter radius: ");
                radius = sc.nextDouble();
                System.out.println("Circumference of Circle: " + circumference(radius));
                break;
            case 3:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select between 1 and 3.");
        }
    }
}
