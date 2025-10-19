package stack.min_stack;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(-2);
        minStack.push(-3);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return 0
        minStack.pop();
        // System.out.println(minStack.top());    // return 2
        System.out.println(minStack.getMin()); // return 1
    }
}

// ["MinStack", "push", -2, "push", -2, "push", -3, "push", -3, "getMin", "pop", "getMin"]