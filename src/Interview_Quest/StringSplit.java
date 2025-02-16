package Interview_Quest;

import java.util.*;

public class StringSplit {

    public static void main(String[] args) {
        String input = "Kindly use OTP - 121212 | Country = India | customer = ABC ;Kindly use OTP - 454545 | Country = USA | customer = XYZ";
        String output =  "OTP For Customer XYZ = 454545";

        List<String> list = new ArrayList<>(Arrays.asList(input.split(";")));
        Map<String, String> map = new HashMap<>();

        for (String s : list) {
            map.put(s.split("//|")[0].split("-")[1], s.split("//|")[2].split("=")[3]);
        }
        System.out.println(map);
    }
}
