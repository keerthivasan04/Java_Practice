package Default_Quest;

import java.util.Arrays;

public class SumOfPairs {
//    19. Java Coding Challenge:
//    Given int sum = 10;
//    and an array {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, f
//    ind the pairs that add up to 10 (e.g., {1, 9}, {2, 8}, etc.).

    public void sumOfPairs(int[] arr, int num) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                int output = i + j;
                if (output == num) {
                    int[] res = {i, j};
                    System.out.println(Arrays.toString(res));
                }
            }
        }
    }

    public static void main(String[] args) {
        SumOfPairs sp = new SumOfPairs();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sp.sumOfPairs(arr, 11);
    }
}
