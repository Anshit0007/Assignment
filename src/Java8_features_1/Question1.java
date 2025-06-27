package Java8_features_1;
interface CheckGreater {
    boolean isGreater(int a, int b);
}

interface Increment {
    int incrementByOne(int a);
}

interface ConcatStrings {
    String combine(String a, String b);
}

interface ToUpper {
    String convert(String s);
}

public class Question1{
    public static void main(String[] args) {
        CheckGreater greater = (a, b) -> a > b;
        System.out.println(greater.isGreater(10, 5));

        Increment inc = a -> a + 1;
        System.out.println(inc.incrementByOne(9));

        ConcatStrings concat = (a, b) -> a + b;
        System.out.println(concat.combine("Hello", " World"));

        ToUpper upper = s -> s.toUpperCase();
        System.out.println(upper.convert("java"));
    }
}