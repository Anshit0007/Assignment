package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<>();
        numbers.add(1.2f);
        numbers.add(2.5f);
        numbers.add(3.8f);
        numbers.add(4.1f);
        numbers.add(5.0f);

        float sum = 0;
        Iterator<Float> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
