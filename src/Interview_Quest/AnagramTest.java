package Interview_Quest;

import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {

        //UPS

        String str  = "Silent";
        String str1 = "Listen";

        String input1 = str.toLowerCase();
        String input2 = str1.toLowerCase();

        char[] input1Arr = input1.toCharArray();
        char[] input2Arr = input2.toCharArray();

        Arrays.sort(input1Arr);
        Arrays.sort(input2Arr);

        if (input1Arr.length == input2Arr.length && Arrays.equals(input1Arr, input2Arr)) {
            System.out.println("Interview_Quest.Anagram");
        } else {
            System.out.println("Not Interview_Quest.Anagram");
        }

    }
}
