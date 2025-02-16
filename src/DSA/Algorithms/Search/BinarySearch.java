package DSA.Algorithms.Search;

public class BinarySearch {

    public static int binaryIterativeSearch(int[] arr, int num){
        int mid, low = 0, high = arr.length-1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] < num) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;

    }

//    public static int binaryRecursiveSearch(int[] arr, int num, int low, int high) {
//
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,10,20};
        int res = binaryIterativeSearch(arr, 10);
        System.out.println(res);
    }
}
