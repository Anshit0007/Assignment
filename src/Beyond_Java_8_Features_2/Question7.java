package Beyond_Java_8_Features_2;

import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        SequencedMap<Integer, String> seqMap = (SequencedMap<Integer, String>) map;

        seqMap.putFirst(1, "One");
        seqMap.putLast(2, "Two");
        seqMap.putLast(3, "Three");

        System.out.println(seqMap);
        System.out.println(seqMap.firstEntry());
        System.out.println(seqMap.lastEntry());

        seqMap.pollFirstEntry();
        seqMap.pollLastEntry();

        System.out.println(seqMap);

        Map<Integer, String> reversedMap = seqMap.reversed();
        System.out.println(reversedMap);
    }
}
