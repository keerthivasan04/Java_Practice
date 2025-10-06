package Interview_prep_2025;

import java.util.Arrays;

public class SecondLargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,9,5,10};
        int second_max = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++){
            second_max = arr[i];
            if (second_max > arr[i]) {
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }
}
