package Sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String arr[] = {"Apple", "Orange"};
        for (String str : arr) {
            Set<String> set = new LinkedHashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(String.valueOf(str.charAt(i)));
            }
            System.out.println(set);
        }

    }
}
