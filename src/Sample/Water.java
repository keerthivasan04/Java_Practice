package Sample;

public class Water {

    /*
    input: arr[] = [3, 0, 1, 0, 4, 0, 2]
Output: 10
Explanation: The expected rainwater to be trapped is shown in the above image.

Input: arr[] = [3, 0, 2, 0, 4]
Output: 7
Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.

Input: arr[] = [1, 2, 3, 4]
Output: 0
Explanation: We cannot trap water as there is no height bound on both sides
     */
    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 0, 4};
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            left[i] = (i == 0) ? arr[i] : Math.max(arr[i], left[i - 1]);
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            right[j] = (j == arr.length - 1) ? arr[j] : Math.max(arr[j], right[j + 1]);
        }
        for (int k = 0; k < arr.length; k++) {
            water += Math.min(left[k], right[k]) - arr[k];
        }
        System.out.println(water);

    }
}
