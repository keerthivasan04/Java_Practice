package Interview_prep_2025;

import java.util.*;

public class RemoveDuplicatesFromArray_List {
    public static void removeDuplicatesFromArray(int[] arr){
        Set<Integer> set = new LinkedHashSet();
        for (int i = 0 ; i < arr.length; i++){
            set.add(arr[i]);
        }
        for (int num : set){
            System.out.println(num);
        }
    }
    public static void removeDuplicatesFromList(List list){
        Set<Integer> set = new LinkedHashSet();
        for (int i = 0 ; i < list.size(); i++){
            set.add((int)list.get(i));
        }
        for (int num : set){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6,7,7};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        removeDuplicatesFromArray(arr);
        removeDuplicatesFromList(list);
    }
}
