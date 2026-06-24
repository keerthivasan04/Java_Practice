package Interview_prep_2026;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapQuest1 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("fruit", Arrays.asList("apple", "mango"));
        map.put("fruit1", Arrays.asList("orange", "banana"));
        map.put("fruit2", List.of("Kiwi", "watermelon", "Muskmelon"));

        System.out.println(map.get("fruit"));
        System.out.println(map.get("fruit1"));
        System.out.println(map.get("fruit2"));
    }
}
