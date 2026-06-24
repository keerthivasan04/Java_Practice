package Interview_prep_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String str = "abcdefbcdaf";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()){
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0)+1);
            }else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
