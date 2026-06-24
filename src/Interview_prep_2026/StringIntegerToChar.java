package Interview_prep_2026;


public class StringIntegerToChar {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        //output = abbdcfdh
        String output = "";
        char[] array = str.toCharArray();
        for (int i = 0 ; i < str.length(); i++){
            if (Character.isDigit(array[i])){
//                output  += (char) (Integer.valueOf(String.valueOf(array[i])) + array[i - 1]);
                int currentPos = Integer.parseInt(String.valueOf(array[i]));
                int previousPos = array[i - 1];
                output += (char) (currentPos + previousPos);
            }else{
                output += array[i];
            }
        }
        System.out.println(output);
    }
}
