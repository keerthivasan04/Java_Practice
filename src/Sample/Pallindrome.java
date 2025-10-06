package Sample;

public class Pallindrome {
    public static void main(String[] args) {
        int num = 1211;
        int originalNum = num;
        int revNum = 0;
        while(num != 0){
            int a = num %10;
            revNum = revNum * 10 + a;
            num  = num/10;
        }
        if (revNum == originalNum) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
