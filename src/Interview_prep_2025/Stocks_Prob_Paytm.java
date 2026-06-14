package Interview_prep_2025;

import java.util.*;

public class Stocks_Prob_Paytm {
    public static void main(String[] args) {
        /*Given the input lists `𝗽𝗿𝗲𝘀𝗲𝗻𝘁 = [𝟱, 𝟰, 𝟲, 𝟮, 𝟯]`, `𝗳𝘂𝘁𝘂𝗿𝗲 = [𝟴, 𝟱, 𝟰, 𝟯, 𝟱]`,
        and a budget of 10, what is the maximum profit you can achieve?
        For example, you can buy stocks at indices 0, 3, and 4 for a total of 5 + 2 + 3 = 10
        and sell them the next year for 8 + 3 + 5 = 16, resulting in a profit of 6.
         */
        int[] present = {5, 4, 6, 2, 3};
        int[] future = {8,5,4,3,5};
        int budget = 10;

        int n = present.length;
        int[] profit = new int[n];

        for (int i = 0; i < n; i++) {
            profit[i] = future[i] - present[i];
        }


    }
}
