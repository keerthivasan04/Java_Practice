package LinkedIN;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbersBetweenTwoGivenNumbers {

    public static int getRandomValue(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static boolean getAllValue(int min, int max) {
        for (int i = min; i < max ; i++) {
            System.out.println(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int min = 1, max = 100;
//        System.out.println(getRandomValue(min, max));
        System.out.println(getAllValue(min, max));
    }
}
