package Beyond_Java_8_Features_2;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Apple");
        list.addLast("Banana");
        list.addLast("Cherry");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        List<String> reversedList = list.reversed();
        System.out.println(reversedList);

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        SequencedSet<String> seqSet = (SequencedSet<String>) set;

        seqSet.addFirst("Zero");
        seqSet.addLast("Four");

        System.out.println(seqSet);
        System.out.println(seqSet.getFirst());
        System.out.println(seqSet.getLast());

        seqSet.removeFirst();
        seqSet.removeLast();

        System.out.println(seqSet);

        Set<String> reversedSet = seqSet.reversed();
        System.out.println(reversedSet);
    }
}
