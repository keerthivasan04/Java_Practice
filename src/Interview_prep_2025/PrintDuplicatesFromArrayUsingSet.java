package Interview_prep_2025;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesFromArrayUsingSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 3, 5, 6};
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                dup.add(num);
            }
        }
        System.out.print(dup);
    }
}
