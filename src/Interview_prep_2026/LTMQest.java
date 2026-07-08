package Interview_prep_2026;

public class LTMQest {
    public static void main(String[] args) {
        String input = "Keerthivasan";
        String str = "";
        for (int i = input.length()/2; i < input.length(); i++){
            char c = input.charAt(i);
            str += c;
        }
        System.out.println(str);
        String res = "";
        for (int j = str.length() -1 ; j >=0; j--){
            res = res + str.charAt(j);
        }
        System.out.println(res);
    }
}
