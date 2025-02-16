package Interview_Quest;

public class StringPalindrome {

    //EY
    public static void main(String[] args) {
        String a = "abc";
        String res = "";
        for (int i = a.length()-1 ; i >= 0; i--){
            res = a.charAt(i) + res;
        }

        if (a==res) {
            System.out.println(a +" = Palindrome");
        }
        else {
            System.out.println(a + " = Not Palindrome");
        }
    }
}
