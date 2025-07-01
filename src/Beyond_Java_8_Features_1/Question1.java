package Beyond_Java_8_Features_1;

import java.util.stream.Stream;

public class Question1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);
        stream.limit(10).forEach(System.out::println);
    }
}
