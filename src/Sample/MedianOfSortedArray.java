package Sample;

import java.util.Arrays;

public class MedianOfSortedArray {
    /*
    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.
     */
    public static void main(String[] args) {
        int[] num1 = {1,3,4};
        int[] num2 = {2};
        int[] merged = new int[num1.length + num2.length];
//        System.arraycopy(num1, 0, merged, 0, num1.length);
//        System.arraycopy(num2, 0, merged, num1.length, num2.length);
        for (int i = 0 ; i < num1.length ; i++) {
            merged[i] = num1[i];
        }
        for (int j = 0 ; j < num2.length ; j++) {
            merged[num1.length + j] = num2[j];
        }
        Arrays.sort(merged);
        for (int val : merged) {
            System.out.println(val);
        }
//        int len = merged.length;
//        if (len % 2 == 1) {
//            int i = merged[len/2];
//            System.out.println(i);
//        }else {
//            double j = (merged[len/2 - 1] + merged[len/2]) /2.0;
//            System.out.println(j);
//        }
    }
}
