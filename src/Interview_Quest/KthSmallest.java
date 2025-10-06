package Interview_Quest;

import java.util.Arrays;

public class KthSmallest {

    //Microsoft
    public static void main(String[] args) {

        int[] n = {7, 10, 4, 3, 20, 15};
        int k = 3;
        //output = 7
//        Arrays.sort(n);
//        BubbleSort
        for (int i = 0; i<n.length; i++){
            for (int j = 0; j< n.length-i-1; j++){
                if(n[j] > n[j+1]) {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        for (int num : n) {
            System.out.println(num);
        }
        System.out.println("kth smallest num is : " + n[k-1]);
    }

}
