package Interview_prep_2025;

public class Reverse {
    public static void integerReverse(int a){
        int res = 0;
        while(a != 0){
            int b = a%10;
            res = res*10 + b;
            a = a/10;
        }
        System.out.println(res);
    }
    public static void stringReverse(String s) {
        String res = "";
        for (int i = s.length()- 1; i >= 0; i--){
            res = res + s.charAt(i);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int a = 102;
        String s = "Vasan";
        integerReverse(a);
        stringReverse(s);
    }
}
