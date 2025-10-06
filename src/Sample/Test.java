package Sample;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,1,0,0};
        int n = arr.length;

        // bubble sort
        //Ascending order
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n-i-1; j++){
//                if (arr[j] < arr[j+1])            Descending order
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.println(num);
        }
    }
}
