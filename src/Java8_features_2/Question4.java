package Java8_features_2;

import java.util.Optional;

public class Question4 {
    public static void main(String[] args) {
        String value = "Hello";

        Optional<String> optionalValue = Optional.ofNullable(value);

        if (optionalValue.isPresent()) {
            System.out.println("Value: " + optionalValue.get());
        } else {
            System.out.println("No value found");
        }

        String result = optionalValue.orElse("Default");
        System.out.println("Result: " + result);
    }
}
