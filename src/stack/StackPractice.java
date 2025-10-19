package stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push(100);
        System.out.println(stack.peek());
    }
}
