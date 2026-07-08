package Interview_prep_2026.Map;

import java.util.HashMap;
import java.util.Map;

public class FindAvgInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        int sum = 0;
        int avg = 0;
        for (int val : map.values()) {
            sum += val;
        }
        avg = sum/map.size();
        System.out.println(avg);
    }
}
