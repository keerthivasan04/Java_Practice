package Interview_Quest;

import java.util.ArrayList;
import java.util.List;

public class SplitAndCountChar {

    // Split and count Character, Digit, Special Character from String

    // PWC

    public void splitAndCountFromString(String str) {
        int digitCount = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int specialCharCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                System.out.print(c);
                digitCount++;
            } else if (Character.isUpperCase(c)) {
                System.out.print(c);
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                System.out.print(c);
                lowerCaseCount++;
            } else {
                System.out.print(c);
                specialCharCount++;
            }

        }
        System.out.println();
        System.out.println("digitCount : " + digitCount);
        System.out.println("upperCaseCount : " + upperCaseCount);
        System.out.println("loweCaseCount : " + lowerCaseCount);
        System.out.println("specialCharCount : " + specialCharCount);
    }

    // Pinaki

    public void splitAndCountFromArrayList(List<String> str) {
        for (String s : str) {
            int digitCount = 0;
            int alphabeticCount = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    System.out.print(c);
                    digitCount++;
                } else if (Character.isAlphabetic(c)) {
                    System.out.print(c);
                    alphabeticCount++;
                }
            }
            System.out.println();
            System.out.println("digitCount : " + digitCount);
            System.out.println("alphabeticCount : " + alphabeticCount);
        }
    }

    public void splitAndCountFromArray(String[] arr) {
        for (String str : arr) {
           int digitCount = 0;
           int alphabetCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    System.out.print(c);
                    digitCount++;
                } else if (Character.isAlphabetic(c)) {
                    System.out.print(c);
                    alphabetCount++;
                }
            }
            System.out.println();
            System.out.println("digitCount : " + digitCount);
            System.out.println("alphabetCount : " + alphabetCount);
        }
    }

    public static void main(String[] args) {
        SplitAndCountChar im = new SplitAndCountChar();
        im.splitAndCountFromString("123456ABCDabcde789@#$%^");
        List<String> str = new ArrayList<>();
        str.add("12345AbCd");
        str.add("AbCdEf6789");
        im.splitAndCountFromArrayList(str);
        String[] arr = {"abcd1234", "efgh5678", "ij90"};
        im.splitAndCountFromArray(arr);
    }
}

