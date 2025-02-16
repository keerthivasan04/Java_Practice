package Interview_Quest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArrayToArrayList {

    //EY
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        List<Integer> list = new ArrayList<>();
        for (int val : arr){
            list.add(val);
        }
        System.out.println(list);
    }
}
