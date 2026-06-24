package Interview_prep_2026;

public class LargestAndSecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest){
                secondLargest = largest;
                largest = num;
            }else {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
        System.out.println(largest);
    }
}
