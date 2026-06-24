package Interview_prep_2026;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int res = 1;
        for (int i = 1; i <= num; i++){
            res *= i;
        }
        System.out.println(res);

        int output = IntStream.rangeClosed(1, num)
                .reduce(1, (a,b) -> a*b);
        System.out.println(output);
    }
}
