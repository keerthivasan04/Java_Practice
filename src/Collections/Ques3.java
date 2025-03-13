package Collections;

import java.util.ArrayList;

public class Ques3 {
    public static void main(String[] args) {
        /*
        Reverse the ArrayList
        Create an ArrayList of String elements, e.g., ["A", "B", "C", "D", "E"].
        Write a method to reverse the order of elements in the ArrayList.
        Print the reversed ArrayList.
         */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

//        Collections.reverse(arrayList);

        ArrayList<String> rev = new ArrayList<>();
        for (int i = arrayList.size()-1 ; i>=0 ; i--) {
            rev.add(arrayList.get(i));
        }
        System.out.println(rev);
    }
}
