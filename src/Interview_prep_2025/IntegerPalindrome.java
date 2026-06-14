package Interview_prep_2025;

public class IntegerPalindrome {
    public static void main(String[] args) {
        int a = 131;
        int temp = a;
        int res = 0;
        while (a !=0){
            int b = a % 10;
            res = res*10 + b;
            a  = a/10;
        }
        if (res == temp){
            System.out.println(res + ": Palindrome");
        }else {
            System.out.println(res + ": Not Palindrome");
        }
    }
}
