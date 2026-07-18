package Interview_prep_2026.String;

public class CheckCharOrder {
    public static void main(String[] args) {
        String input = "aaabb";
        boolean foundB = false;
        boolean res = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'b') {
                foundB = true;
            } else if (c == 'a' && foundB) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}
