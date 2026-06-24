package Interview_prep_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharsInAString {
    public static void main(String[] args) {
        String str = "aabcdddeeeef";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
//            if(map.containsKey(c)){
//                map.put(c, map.get(c)+1);
//            }else {
//                map.put(c, 1);
//            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
