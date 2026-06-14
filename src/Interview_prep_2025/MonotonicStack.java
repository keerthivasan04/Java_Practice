package Interview_prep_2025;

import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {
        // decreasing order
        //[1,3,4,2,6]
        int[] arr = {1,3,4,2,6};
        Stack<Integer> stack = new Stack<>();
        for (int num : arr){
            if (!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
            }  else {
                stack.push(num);
            }
        }
        System.out.println(stack);
    }
}
