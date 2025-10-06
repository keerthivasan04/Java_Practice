package Interview_prep_2025;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {8,9,10,11,12,13};
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++){
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            res[arr1.length + i] = arr2[i];
        }
        for (int num : res){
            System.out.println(num);
        }
    }
}
