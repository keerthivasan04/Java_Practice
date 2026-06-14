package Interview_prep_2025;

import java.util.LinkedHashSet;
import java.util.Set;

public class PangramCheck {

    // check the String has all 26 Alphabets

    public static boolean pangramCheck(String str) {

        long count = str.toLowerCase()
                .chars().filter(ch -> ch >='a'&&ch <='z')
                .distinct()
                .count();
        return count == 26;

//        str = str.toLowerCase();
//        Set<Character> set = new LinkedHashSet();
//
//        for (char c : str.toCharArray()) {
//            if (c >= 'a' && c <= 'z') {
//                set.add(c);
//            }
//        }
//        return set.size() == 26;
    }
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "Hello";
        System.out.println(pangramCheck(str1));
        System.out.println(pangramCheck(str2));
    }
}
