package Interview_prep_2025;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > arr.length / 2) {
                System.out.println(arr[i]);
            }
        }
        //bubble sort
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.print(num);
        }
    }
}
