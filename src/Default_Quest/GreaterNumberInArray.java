package Default_Quest;

import java.util.Arrays;

public class GreaterNumberInArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 8, 10, 23, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
//        for (int val : arr) {
//            System.out.println(val);
//        }
    }
}
