package Interview_prep_2026_June;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunc {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Blackyyy");
        list.add("Karuvachiii");
        list.add("Kari vandu");

        //type 1
        list.forEach(ele -> System.out.println(ele));

        //type 2
        list.forEach(System.out::println);

        //type 3
//        for (String ele : list) {
//            System.out.println(ele);
//        }

    }
}
