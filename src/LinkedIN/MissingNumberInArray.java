package LinkedIN;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6, 7};
        int total_count = 7;
        int expected_num = total_count * ((total_count + 1) / 2);
        int num_sum = 0;
        for (int i : arr) {
            num_sum += i;
        }
        System.out.println(expected_num - num_sum);
    }
}
