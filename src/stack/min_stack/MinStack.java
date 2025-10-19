package stack.min_stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);

        if (stack2.isEmpty()) {
            stack2.push(val);
        } else {
            int peek = stack2.peek();
            if (peek >= val) {
                stack2.push(val);
            }
        }

    }

    public void pop() {
        int num1 = stack.peek();
        stack.pop();
        int num2 = stack2.peek();

        if (num1 == num2) {
            stack2.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}

