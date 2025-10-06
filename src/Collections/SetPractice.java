package Collections;

import java.util.*;

enum test {test, test1, test2, test3};

public class SetPractice {

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(1,2,3,4,5,6,7,0,9));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
//        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
//        System.out.println(intersection);

        Set<Integer> diff = new HashSet<>(b);
        diff.removeAll(a);
//        System.out.println(diff);

        for (int val : a) {
//            System.out.print(val +",");
        }

        Set<test> set = EnumSet.of(test.test, test.test1, test.test2, test.test3);

//        System.out.println(set);

        Set<Integer> test1 = new TreeSet<>();
//        test1.addAll(Arrays.asList(1,4,7,8,9,0,5,2));
        test1.add(2);
        test1.add(4);
        test1.add(0);
        test1.add(1);
        System.out.println(test1);
    }
}
