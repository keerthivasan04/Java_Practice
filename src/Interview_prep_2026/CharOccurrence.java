package Interview_prep_2026;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "aabbcddeeefgggg";
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        long count;
        for (char c : uniqueChars) {
             count = str.chars().filter(ch->ch == c).count();
            System.out.println(c + " = "+ count);
        }

        Map<Character, Long> map = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        map.forEach((k,v) -> System.out.println(k+" = "+v));
    }
}
