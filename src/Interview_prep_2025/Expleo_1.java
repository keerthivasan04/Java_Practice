package Interview_prep_2025;

import java.util.HashMap;
import java.util.Map;

public class Expleo_1 {
    public static void main(String[] args) {
        /*
         input String s = "Test"
         output String s1 = "*es**"
         */
        String s = "Test";
        String str = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()){
            if (map.get(c) > 1){
                res.append('*');
            }else {
                res.append(c);
            }
        }
        for (int count : map.values()) {
            if (count > 1) {
                res.append("*");
            }
        }
        System.out.println(res);
    }
}
