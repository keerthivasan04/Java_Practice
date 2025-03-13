package Collections;

import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        /*
        ArrayList of Custom Objects
        Define a class Person with fields name (String) and age (int).
        Create an ArrayList of Person objects and add at least 3 Person objects to the list.
        Write a method to print the names of all people who are older than 30.
        Write a method to find and print the name of the youngest person in the list.
         */

        ArrayList<String> personArr = new ArrayList<>();
        personArr.add("abc");
        personArr.add("def");
        personArr.add("ghi");
        ArrayList<Integer> personAge = new ArrayList<>();
        personAge.add(10);
        personAge.add(30);
        personAge.add(50);

        Map<String, Integer> map = new HashMap<>();
        map.put(personArr.get(0), personAge.get(0));
        map.put(personArr.get(1), personAge.get(1));
        map.put(personArr.get(2), personAge.get(2));

        String res = null;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > 30) {
                System.out.println("Age greater than 30 = " + entry.getKey());
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                res = entry.getKey();
            }
        }
        System.out.println("small boy = " +res);

        // other way
        Optional<Map.Entry<String, Integer>> minAge = map.entrySet()
                .stream().min(Map.Entry.comparingByValue());

         minAge.ifPresent(entry -> System.out.println(entry.getKey()));
    }
}
