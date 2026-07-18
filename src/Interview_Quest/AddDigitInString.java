package Interview_Quest;

public class AddDigitInString {

    //CGI

    public static void main(String[] args) {
        String[] strArr = {"7sad9","hgds99","hfd78"};
        int res = 0;
        for (String str : strArr) {
            String resString = "";
            for (int i = 0; i < str.length() ; i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    resString += c;
                }
            }
            if (resString.length() == 2) {
                res = res + Integer.parseInt(resString);
            }
        }
        System.out.println(res);
    }
}
