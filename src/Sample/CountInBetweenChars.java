package Sample;

public class CountInBetweenChars {
    public static void main(String[] args) {
//        Input :  localisation
//        Output : L10N
        String str = "localisation";
        char[] c = str.toCharArray();
        String res = "";
        for (int i = 1; i<str.length() -1; i++) {
            char c1 = str.charAt(i);
            res += c1;
        }
        StringBuilder res1 = new StringBuilder();
        StringBuilder resN = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
//            System.out.println(str.charAt(0));
//            if (str.charAt(i) == 0 && str.charAt(i) == str.length() -1) {
                res1.append(str.charAt(0));
                resN.append(str.charAt(str.length() - 1));
                break;
//            }
        }
//        System.out.println(res1);
        System.out.println(res1.toString().toUpperCase() + res.length() + resN.toString().toUpperCase());
    }
}
