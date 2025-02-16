package DSA.Algorithms.Search;

public class LinearSearch {

    public static  int linearSearch(int[] arr, int num) {
        for (int i = 0 ;i < arr.length;i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int res = linearSearch(arr, 9);
        if(res == -1) {
            System.out.println("Not found " + res);
        }
        else {
            System.out.println("Found " + res);
        }
    }
}
