package Interview_prep_2025;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        String s = str.toLowerCase();
        String res = "";
        for (int i = s.length() -1 ; i >= 0; i--){
            res = res + s.charAt(i);
        }
        if (s.equals(res)){
            System.out.println(s + " : Palindrome");
        }else{
            System.out.println(s + " : Not a Palindrome");
        }
    }
}
