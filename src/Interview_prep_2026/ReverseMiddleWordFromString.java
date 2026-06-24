package Interview_prep_2026;

public class ReverseMiddleWordFromString {
    public static void main(String[] args) {
        String str = "Tata Consultancy Services";
        String[] strArr = str.split(" ");
        String res = "";
        for (String s : strArr) {
            if (s.equals("Consultancy")) {
                for (int i = s.length() - 1; i>=0 ;i--){
                    res += s.charAt(i);
                }
            }
        }
        strArr[1] = res;
        String finalRes = String.join(" ", strArr);
        System.out.println(finalRes);
    }
}
