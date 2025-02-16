package DSA;

public class MaxProdOfTwoIntInArray {

    void maxProdOfIntInArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int res = arr[i] * arr[j];
                if (res > max) {
                    max = res;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        MaxProdOfTwoIntInArray mi = new MaxProdOfTwoIntInArray();
        int[] arr = {8,3,7,4,5,6};
        mi.maxProdOfIntInArray(arr);
    }
}
