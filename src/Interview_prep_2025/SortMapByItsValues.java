package Interview_prep_2025;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortMapByItsValues {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(1,3);
        map.put(2,6);
        map.put(3,8);
        map.put(4,5);
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e-> System.out.println(e.getKey() + " = " + e.getValue()));
        map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(e-> System.out.println(e.getKey() + " = " + e.getValue()));
    }
}
