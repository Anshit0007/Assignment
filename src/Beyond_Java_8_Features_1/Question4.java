package Beyond_Java_8_Features_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "C++");
        List<String> list = stream.collect(Collectors.toUnmodifiableList());
        list.forEach(System.out::println);
    }
}
