package Interview_prep_2025;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        String arr[] = {"Apple", "Banana"};
        for (String str : arr) {
            String s = str.toLowerCase();
            Set<String> set = new LinkedHashSet<>();
            for (int i = 0; i<s.length(); i++){
                set.add(String.valueOf(s.charAt(i)));
            }
            System.out.println(set);
        }
    }
}
