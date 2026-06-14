package Interview_prep_2025;

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.add(2);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        System.out.println(stack.get(0));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.push(7));
        System.out.println(stack.isEmpty());
        System.out.println(stack.remove(1));
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());
        System.out.println(stack.empty());
        System.out.println(stack);
    }
}
