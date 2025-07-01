package Beyond_Java_8_Features_1;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cherry");
        Set<String> set = Set.of("Red", "Green", "Blue");
        Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);

        list.forEach(System.out::println);
        set.forEach(System.out::println);
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
