package Java8_features_2;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first date (yyyy-mm-dd):");
        String firstInput = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput);

        System.out.println("Enter second date (yyyy-mm-dd):");
        String secondInput = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput);

        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is before second date");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is after second date");
        } else {
            System.out.println("Both dates are equal");
        }

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime japanTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("India Time: " + indiaTime);
        System.out.println("US Time: " + usTime);
        System.out.println("Japan Time: " + japanTime);
    }
}
