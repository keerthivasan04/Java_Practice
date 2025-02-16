package DSA;

public class RotateArrByKSteps {
    /*
    Input: num = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */

    // inprogress

    public void rotateArr(int[] num, int k) {
        for (int i = num.length - 1; i >= k; i--) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        RotateArrByKSteps ra = new RotateArrByKSteps();
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        ra.rotateArr(num, 2);
    }
}
