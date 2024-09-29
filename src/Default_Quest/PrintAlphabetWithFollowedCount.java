package Default_Quest;

public class PrintAlphabetWithFollowedCount {

    //input = a1b3
    //output = abbb

    public static void printAlphabetWithFollowedCount(String input) {
        for (int i = 1; i < input.length(); i = i + 2) {
            char c = input.charAt(i - 1);        //a
            char l = input.charAt(i);            //1
            for (int j = 0; j < Character.getNumericValue(l); j++) {
                System.out.print(c);
            }
        }
    }

    public static void main(String[] args) {
        printAlphabetWithFollowedCount("a2b3");
    }

}
