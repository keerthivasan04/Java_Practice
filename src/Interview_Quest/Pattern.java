package Interview_Quest;

public class Pattern {

    // x-pattern

    static void pattern(String input) {
        int n = input.length();
        String str[] = input.split("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println(str[i]);
                }
                else if (i + j == n - 1) {
                    System.out.println(str[j]);
                }
                else {
                    System.out.println(" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Pattern.pattern("NUMBER");
    }
}
