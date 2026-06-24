package Interview_prep_2026;

public class StringCompression {
    public static void main(String[] args) {
        String input = "abbcccdddd";
        String output = "";
        char[] strArr = input.toCharArray();
        int count = 1;
        for (int i = 0; i<strArr.length; i++){
            if ((i+1)< strArr.length && strArr[i] == strArr[i+1]) {
                count ++;
            }else {
                output = output + strArr[i] + count;
                count = 1;
            }
        }
        System.out.println(output);
    }
}
