package Interview_prep_2026.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class FindAvg {
    public static void main(String[] args) {
        int[] arr = {2, 30, 50, 70, 23, 25};

        double num = Arrays.stream(arr).average().orElse(0);

        double res = BigDecimal.valueOf(num).setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println(res);
//        System.out.println(Math.round(num));
//        System.out.println(Math.round(num * 100.0)/100.0);
    }
}
