package Java8_features_2;

import java.util.*;
import java.util.stream.*;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 4, 9, 1, 6, 3);

        int sum = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
