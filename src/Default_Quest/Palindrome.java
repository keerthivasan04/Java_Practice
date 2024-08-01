package Default_Quest;

public class Palindrome {
    public static void main(String[] args) {

        //integer reverse
        int a = 131;
        int res = a;
        int c = 0;
        while (a != 0) {
            int b = a % 10;
            c = c * 10 + b;
            a = a / 10;
        }
        System.out.println(c);
        System.out.println(c == res);
    }
}
