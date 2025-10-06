package Sample;

public class Fibonnoci {
    /*
    Input: n = 4
    Output: 3
    Explanation: The Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, ...
     */
    public static void main(String[] args) {
        int n = 4;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
