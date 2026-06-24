package Interview_prep_2026;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        String ss = str.toLowerCase();
        String s = ss;
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            res = res + c;
        }
        if (ss.equals(res)) {
            System.out.println("Palindrome: "+ ss);
        }else{
            System.out.println("Not Palindrome: "+ss);
        }
    }
}
