package Interview_prep_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(10);
        list.add(6);
        list.add(0);
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(11);
        list1.add(10);
        list1.add(61);
        list1.add(20);
        List<Integer> res = new ArrayList<>();
        for (int num : list){
            res.add(num);
        }
        for (int num : list1){
            res.add(num);
        }
        // bubble sort
        for (int i = 0 ; i < res.size(); i++){
            for (int j = 0 ; j< res.size() - i -1 ; j++){
                if (res.get(j) > res.get(j+1)){
                    int temp = res.get(j);
                    res.set(j, j+1);
                    res.set(j+1, temp);
                }
            }
        }
        for (int num : res){
            System.out.println(num);
        }
    }
}
