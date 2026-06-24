package Interview_prep_2026;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunc {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");

        //type 1
        list.forEach(e-> System.out.println(e));
        //type 2
        list.forEach(System.out::println);
        //type 3
        for (String val : list) {
            System.out.println(val);
        }
    }
}
