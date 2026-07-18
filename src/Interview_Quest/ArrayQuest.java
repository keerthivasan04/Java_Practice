package Interview_Quest;

import java.util.Arrays;

public class ArrayQuest {
//    int a[]  = {1,2,3,4,5,6}
//
//    o/p = : 1,5,2,3,4,6

    public static void main(String[] args) {

        //UPS

        int[] arr = {1, 2, 3, 4, 5, 6};

        // output = 1[0], 5[4] --> 5[1]

        int temp = arr[1];
        arr[1] = arr[4];
        arr[4] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
