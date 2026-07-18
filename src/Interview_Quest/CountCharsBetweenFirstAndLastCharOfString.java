package Interview_Quest;

public class CountCharsBetweenFirstAndLastCharOfString {

    // CGI

    public static void main(String[] args) {
//        String input = "localisation";
        String input = "vasan";
        char[] chars = input.toCharArray();
        String resString = "";
        String resChar1 = "";
        String resChar2 = "";
        for (int j = 1; j < input.length() -1 ; j++) {
            resString += input.charAt(j);
        }
        for (int i = 0; i < chars.length; i++) {
                resChar1 = String.valueOf(chars[0]).toUpperCase();
                resChar2 = String.valueOf(chars[chars.length - 1]).toUpperCase();
        }
        System.out.println(resChar1 + resString.length() + resChar2);
    }
}
