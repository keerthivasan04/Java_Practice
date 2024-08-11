package Interview_Quest;

import java.util.Arrays;

public class KthSmallest {

    //Microsoft
    public static void main(String[] args) {

        int[] n = {7, 10, 4, 3, 20, 15};
        int k = 3;
        //output = 7
        Arrays.sort(n);
        System.out.println(n[k-1]);
    }

}
