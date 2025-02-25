package Interview_Quest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNum {

    //Pando
    public void secLarNum(int[] num) {
        Arrays.sort(num);
        int size = num.length;
        System.out.println(num[size - 2]);
    }

    public void secLarNumber(int[] num) {
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    max = num[i] - 1;
                } else {
                    max = num[j] - 1;
                }
            }
        }
        System.out.println(max);
    }

    public void largestNum(int[] num) {
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    max = num[i];
                } else {
                    max = num[j];
                }
            }
        }
        System.out.println(max);
    }

    public void secLarNumFrmList(List<Integer> num) {
        int max = 0;
        for (int i = 0; i < num.size() - 1; i++) {
            for (int j = i + 1; j < num.size() - 1; j++) {
                if (num.get(i) > num.get(j)) {
                    max = num.get(i);
                } else {
                    max = num.get(j);
                }
            }
        }
        System.out.println(max);
    }

    public void largeNum(int[] num) {
        Arrays.sort(num);
        System.out.println(num[num.length - 1]);
    }

    public static void main(String[] args) {
        SecondLargestNum sln = new SecondLargestNum();
        int[] num = {1, 3, 5, 6, 2, 7, 9, 8};
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(4);
        nums.add(45);
        nums.add(99);
        sln.secLarNumFrmList(nums);
//        sln.secLarNumber(num);
//        sln.largestNum(num);
//        sln.largeNum(num);
    }
}
