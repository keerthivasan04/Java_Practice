package Sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {
/*
Input: s = "abcabcdbb"
Output: 4
Explanation: The answer is "abcd", with the length of 4.
 */
    public static void main(String[] args) {
        String s = "abcabckbbee";
        int a = 0;
        int len = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++){
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(a));
                a++;
            }
            set.add(s.charAt(i));
            len = Math.max(len, i - a);
        }
        System.out.println(len);
    }
}
