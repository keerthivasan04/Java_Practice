package Default_Quest;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public void stringReverse(String str) {
        //String Reverse
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //res = str.charAt(i) + res;            ==> String
            res.insert(0, str.charAt(i));   // String Builder
        }
        System.out.println(res);
    }

    public void stringReverseFromArrayList(List<String> str) {
        //String Reverse From Array List or Linked List or Vector
        for (String s : str){
            stringReverse(s);
        }
    }

    public static void main(String[] args) {
        StringReverse strRev = new StringReverse();
        strRev.stringReverse("Keerthi");
        List <String> str = new ArrayList<>();
        str.add("Vasan");
        str.add("Sandy");
        strRev.stringReverseFromArrayList(str);
    }

}
