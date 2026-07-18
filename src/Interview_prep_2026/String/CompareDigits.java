package Interview_prep_2026.String;

public class CompareDigits {
    public static void main(String[] args) {
        String input = "658488";
        StringBuilder res = new StringBuilder();

        for (int i = 0 ; i < input.length() - 1; i++){
            char current = input.charAt(i);
            char next = input.charAt(i+1);

            if (current > next) {
                res.append(">");
            } else if (current < next) {
                res.append("<");
            } else {
                res.append("=");
            }
        }
        System.out.println(res);
    }
}
