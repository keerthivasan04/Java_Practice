package Interview_prep_2026;

import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;

public class PrintDuplicates {

    public static void printDuplicatesUsingSet(String str) {
        String res = "";
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                res = res + c;
            }
        }
        System.out.println("Set : " + res);
    }

    public static void printDuplicatesUsingMap(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        String res = "";
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1) {
                res = res + entry.getKey();
            }
        }
        System.out.println("Map : " + res);
    }

    public static void printDuplicatesUsingForLoop(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1 ; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    res = res + str.charAt(i);
//                    break;
                }
            }
        }
        System.out.println("For Loop : " +res);
    }

    public static void main(String[] args) {
        String str = "kanika";
        printDuplicatesUsingForLoop(str);
        printDuplicatesUsingMap(str);
        printDuplicatesUsingSet(str);
    }
}
