package Sample;

public class IntegerReverse {

    public static int reverseInt(int num) {
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            res = res * 10 + digit;
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseInt(number);
        System.out.println("Reversed: " + reversed);
    }
}