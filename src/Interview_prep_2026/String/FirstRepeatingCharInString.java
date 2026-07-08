package Interview_prep_2026.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharInString {
    public static void main(String[] args) {
        String str = "Programming";
        String input = str.toLowerCase();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
