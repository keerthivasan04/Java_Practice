package Sample;

public class Sample {

    public static void main(String[] args) {
        int a = 12;
        int res = 0;
        while(a != 0) {
            int b = a % 10;
            res = res * 10 + b;
            a = a / 10;
        }
        System.out.println(res);
    }
}
