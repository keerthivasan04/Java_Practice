package Interview_prep_2025;

public class Factorial {
    public static void main(String[] args) {
        int fib_num = 6;
        int res = 1;
        for (int i = 1; i <= fib_num; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
