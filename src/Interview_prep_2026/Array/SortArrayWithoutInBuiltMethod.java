package Interview_prep_2026.Array;

import java.util.Arrays;

public class SortArrayWithoutInBuiltMethod {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,9,7,8,11,10};
//        for (int i = 0; i<arr.length; i++){
//            for (int j =0 ; j < arr.length-i-1; j++) {
//                if (arr[j]>arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i =0, j=0; i<arr.length & j<arr.length-i-1; i++, j++){
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
