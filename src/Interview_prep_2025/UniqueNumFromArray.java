package Interview_prep_2025;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,5};
        //output = 2
        Map<Integer, Integer> map = new HashMap<>();
        for (int num :arr){
            if (map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 1)+1);
                //map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " = " + entry.getValue());
            if (entry.getKey() < 2) {
                System.out.println(entry.getValue());
            }
        }
    }
}
