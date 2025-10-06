package Interview_prep_2025;

import java.util.Arrays;

public class SecondLargestNumInArrayUsingInbuiltMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,10,9,11};
        int max;
        Arrays.sort(arr);
        max = arr[arr.length-2];
        System.out.println(max);
    }
}
