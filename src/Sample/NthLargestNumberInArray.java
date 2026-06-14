package Sample;

import java.util.Arrays;

public class NthLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,9,6,7,8,10,11};
        int n = 5;
        Arrays.sort(arr); //1,2,6,7,8,9,10,11
        System.out.println(arr[arr.length - n]);
    }
}
