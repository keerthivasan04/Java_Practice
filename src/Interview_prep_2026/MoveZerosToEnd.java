package Interview_prep_2026;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,2,0,5,0,12,11};
        int pos = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;

                pos++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
