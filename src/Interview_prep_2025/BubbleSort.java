package Interview_prep_2025;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,2,4,5,2,1,0};
        for (int i =0 ; i < arr.length; i++){
            for (int j = 0; j < arr.length - i -1; j++){
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
