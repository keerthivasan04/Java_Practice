package Collections;

import java.util.*;

public class TwoSum {

    /*
    {1,2,3,4,5} ==> target = 5
     index = [1,2]
     */
        public static int[] twoSum(int[] nums, int target) {
            List<Integer> list = new ArrayList<>();     //index [0,1] ==> 2+7 =9
            for(int i = 0; i <nums.length; i++){
                for (int j = i + 1 ; j < nums.length; j++) {
                    if (target == (nums[i] + nums[j])) {
                       list.add(i);
                       list.add(j);
                    }
                }
            }
            int[] res = new int[list.size()];
            for (int k = 0; k< list.size(); k++) {
                res[k] = list.get(k);
            }
            return res;
        }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        twoSum(nums, target);
    }

}
