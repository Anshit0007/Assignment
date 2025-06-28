package Java8_features_2;

import java.util.function.*;

public class Question1 {
    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println("Hello " + s);
        consumer.accept("World");

        Supplier<String> supplier = () -> "Java Supplier Example";
        System.out.println(supplier.get());

        Predicate<Integer> predicate = n -> n > 0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(-5));

        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Hello"));
    }
}
