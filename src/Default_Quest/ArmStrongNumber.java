package Default_Quest;

public class ArmStrongNumber {
    public static void main(String[] args) {
        // cube of each number = input number
        int a = 371;        //==> 27+343+1 = 371
        int b = 0;
        while (a != 0) {
            int res = a % 10;
            b = (int) (b + Math.pow(res, 3));
            a = a / 10;
        }
        System.out.println(b);
    }
}
