package Interview_prep_2026_June;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {
    public static void main(String[] args) {

//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : str.toCharArray()){
//            if (map.containsKey(c)){
//                map.put(c, map.get(c)+1);
//            }else{
//                map.put(c, 1);
//            }
//        }
//
//        for(Map.Entry<Character, Integer> entry : map.entrySet()){
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey());
//            }
//        }
        String str = "kanika";
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                System.out.println(c);
            }
        }
    }
}
