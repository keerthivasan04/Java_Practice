package Interview_prep_2026;

import java.util.Scanner;

public class StringReverse {

    public static void reverseMiddleWord(String s){              //TCS
        String res = "";

        String[] strArr = s.split(" ");
        for (String str : strArr) {
            if (str.equals("Consultancy")) {
                for (int i = str.length() - 1; i >= 0; i--) {
                    char c = str.charAt(i);
                    res = res + c;
                }
            }
        }
        strArr[1] = res;
        String finalRes = String.join(" ", strArr);
        System.out.println("LinkedIN.Reverse only one word in a String : " + finalRes);
    }

    public static void reverseWholeStringByLetter(String s) {
        String res = "";
        for(int i = s.length()-1; i>=0;i--){
            char c = s.charAt(i);
            res = res + c;
        }
        System.out.println(res);
    }

    public static void reverseWholeStringByWord(String s) {
        String[] words = s.split(" ");
        String res = "";
        for (int i = words.length - 1; i>=0; i--){
            res = res + words[i] + " ";
        }
        System.out.println(res);
    }

    public static void reverseWholeStringByWordAndLetterWithoutPositionChange(String s) {
        String[] words = s.split(" ");
        String res = "";
        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i>=0; i--){
                rev += word.charAt(i);
            }
            res += rev + " ";
        }
        System.out.println(res.trim());
    }

    public static void reverseStringByUsingScannerClass(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String res = "";
        for (int i = words.length - 1; i>=0; i--){
            res = res + words[i] + " ";
        }
        System.out.println(res);
    }

    public static void reverseStringWithoutChangingItsPosition(String s) {
        String res = "";
        String[] str = s.split(" ");
        for (String ss : str) {
            String rev = "";
            for (int i=ss.length() - 1; i >=0; i--){
                rev = rev + ss.charAt(i);
            }
            res = res + rev + " ";
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
//        String s = "Tata Consultancy Services";
//        reverseMiddleWord(s);
        String str = "I Love Java";
//        reverseWholeStringByLetter(str);
//        reverseWholeStringByWord(str);
//        String st = "Today is a good day";
//        reverseWholeStringByWordAndLetterWithoutPositionChange(st);
//        reverseStringByUsingScannerClass();
        reverseStringWithoutChangingItsPosition(str);
    }
}
