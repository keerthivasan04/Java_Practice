package Collections;

import java.util.ArrayList;

public class Ques1 {
    public static void main(String[] args) {
        /*
        ArrayList with Integer Values
        Create an ArrayList of Integer type and add the following numbers: 10, 20, 30, 40, 50.
        Calculate and print the sum of all elements in the ArrayList.
        Find the largest element in the ArrayList and print it.
        Remove all even numbers from the ArrayList and print the updated list.
        Find and print the index of the element 30 in the list.
         */

        ArrayList<Integer> arrLst = new ArrayList<>();
        arrLst.add(10);
        arrLst.add(21);
        arrLst.add(30);
        arrLst.add(41);
        arrLst.add(50);

        int res = 0;
        for (int val : arrLst) {
            res = val + res;
        }
        System.out.println("Sum of the arraylist elements = " + res);


        int max = 0;
        for (int val : arrLst) {
            if (val > max){
                max = val;
            }
        }
        System.out.println("Maximum element in the arraylist = "+ max);
        ArrayList<Integer> resList = new ArrayList<>();
        for (int val : arrLst) {
            if (val % 2 != 0) {
                resList.add(val);
            }
        }
        System.out.println("Remove even numbers from the arraylist = " + resList);
        System.out.println("INdex of element 30 =" + arrLst.indexOf(30));

    }
}
