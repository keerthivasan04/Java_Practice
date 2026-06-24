package Interview_prep_2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsFromString {
    public static void main(String[] args) {
        String str = "Keerthivasan";
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        System.out.println(set);
    }
}
