public class FindMaximumDiffInArray {
    public static void main(String[] args) {
       // FindMaximumDifference - int [] arr = {10,90,2,40,1,25}
        int[] arr = {10,90,2,40,1,25};
        //output - 89
        int minVal = arr[0];
        int maxDiff = arr[0];
        for(int num : arr){
            if(num < minVal){
                minVal = num;
            }
            if(num > maxDiff){
                maxDiff = num;
            }
        }
        System.out.println(maxDiff - minVal);
    }
}
