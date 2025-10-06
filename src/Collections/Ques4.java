package Collections;

import java.util.*;

public class Ques4 {

    public static void main(String[] args) {
        /*
        Sorting an ArrayList
        Create an ArrayList of Integer elements: [5, 2, 8, 1, 9, 3].
        Sort the ArrayList in ascending order and print the sorted list.
        Sort the ArrayList in descending order and print the sorted list.
         */

        Vector<Integer> arrLst = new Vector<>(2);
        arrLst.add(5);
        arrLst.add(2);
        arrLst.add(8);
        arrLst.add(1);
        arrLst.add(9);
        arrLst.add(3);

//        Collections.sort(arrLst);
        System.out.println(arrLst);

//        for (int i = 0 ; i < arrLst.size()-1; i++) {
//            for (int j = 0; j < arrLst.size()-1-i; j++) {
//                if (arrLst.get(j) < arrLst.get(j+1)) {
//                    int temp = arrLst.get(j);
//                    arrLst.set(j, arrLst.get(j + 1));
//                    arrLst.set(j + 1, temp);
//                }
//            }
//        }
//        System.out.println(arrLst);
    }
}
