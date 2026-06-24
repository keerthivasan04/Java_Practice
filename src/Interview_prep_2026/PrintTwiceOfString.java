package Interview_prep_2026;

public class PrintTwiceOfString {
    public static void printCharTwice(String s) {
        String str = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            res.append(c).append(c);
        }
        System.out.println(res);
    }

    public static void printWordTwice(String s) {
        String str = s.toLowerCase();
        String[] strArr = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (String val : strArr) {
            res.append(val).append(" ").append(val);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String str = "Test";
        printCharTwice(str);
        printWordTwice(str);
    }
}
