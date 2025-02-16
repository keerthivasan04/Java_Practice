package Default_Quest;

public class MinMaxInArray {

    void minValueInArray(int[] arr){
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i] < min) {
                arr[i] = min;
            }
        }
        System.out.println(min);
    }

    void maxValueInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    void secondMaxValueInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0 ; i < arr.length-1; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        MinMaxInArray mma = new MinMaxInArray();
        int[] arr = {2,3,5,7,8,9};
//        mma.minValueInArray(arr);
//        mma.maxValueInArray(arr);
        mma.secondMaxValueInArray(arr);
    }
}
