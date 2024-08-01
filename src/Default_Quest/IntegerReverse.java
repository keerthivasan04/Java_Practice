package Default_Quest;

public class IntegerReverse {

    public void revInt(int num) {

        //Integer Reverse
        int res = 0;
        while (num != 0) {
            int b = num % 10;
            res = res * 10 + b;
            num = num / 10;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        IntegerReverse ir = new IntegerReverse();
        ir.revInt(199);
    }
}
