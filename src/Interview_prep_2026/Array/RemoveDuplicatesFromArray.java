package Interview_prep_2026.Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 6, 6};
        Set<Integer> set = new HashSet<>();
        for (int val : arr) {
            set.add(val);
        }
        System.out.println(set);
    }
}
