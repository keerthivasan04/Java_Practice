package Interview_prep_2025;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int prod_arr = 1;
        //product of whole array divided by arr values
        int[] res = new int[arr.length];
        for (int num : arr){
            prod_arr = num * prod_arr;
        }
        System.out.println(prod_arr);       //24

        for (int i = 0; i < arr.length;i++){
            int res1 = prod_arr/arr[i];
            res[i] = res1;
        }
        for (int num : res){
            System.out.println(num);
        }
    }
}
