package Interview_prep_2025;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrenceInString {
    public static void main(String[] args) {
        String s = "Madam";
        String str = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
