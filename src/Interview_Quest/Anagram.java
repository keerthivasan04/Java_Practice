package Interview_Quest;

import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {

        //UPS

        String str  = "Silent";
        String str1 = "Listen";

        String input1 = str.toLowerCase();
        String input2 = str1.toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c, 1);
            }

        }
        for (char c1 : input2.toCharArray()) {
            if (map.containsKey(c1)) {
                System.out.println("Pass");
            } else {
                System.out.print("Fail");
            }
        }



    }
}
