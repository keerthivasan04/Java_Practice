package Interview_prep_2025;

public class GetThePositionOfCharInString {
    public static void main(String[] args) {
        String str = "123456b";
        for(char c : str.toCharArray()) {
//            if (!Character.isDigit(c)){
//                System.out.println(str.indexOf(c));
//            }
//            if (c >= 'a' && c <= 'z'){
//                System.out.println(str.indexOf(c));
//            }
            if (c >= '0' && c <= '9'){
                }else {
                System.out.println(str.indexOf(c));
            }
        }
    }
}
