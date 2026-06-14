package Sample;

import java.util.*;

public class ArrayQuest1 {
    public static void main(String[] args) {
        var x = 5;

        int[] arr1 = {1,2,4,5,6,8};
        int[] arr2 = {1,3,4,5,7,9};
        int n = 3;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int a : arr1){
            set1.add(a);
        }
        for (int b : arr2) {
            set2.add(b);
        }

        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);
        System.out.println("Common" + common);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> uncommon = new HashSet<>(union);
        uncommon.removeAll(common);
        System.out.println("UnCommon" + uncommon);

        List<Integer> list = new ArrayList<>(union);
        Collections.sort(list, Collections.reverseOrder());

    }
}
