package stack;

import java.util.Stack;

public class EvaluateReversePolishNotion {
    public static int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        Stack<String> stack = new Stack<>();
        int result = 0;
        
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")
                    || tokens[i].equals("-")
                    || tokens[i].equals("*")
                    || tokens[i].equals("/")) {
                int num1 = Integer.parseInt(stack.peek());
                stack.pop();

                int num2 = Integer.parseInt(stack.peek());
                stack.pop();

                if (tokens[i].equals("+")) {
                    result = num2 + num1;
                } else if (tokens[i].equals("-")) {
                    result = num2 - num1;
                } else if (tokens[i].equals("*")) {
                    result = num2 * num1;
                } else {
                    result = num2 / num1;
                }

                stack.push(String.valueOf(result));
            } else {
                stack.push(tokens[i]);
            }
        }

        return result;
    }

    public static void main (String[] args) {
        String[] tokens = {"1","2","+","3","*","4","-"};
        // String[] tokens = {"18", "20", "-"};
        int evalRPN = evalRPN(tokens);
        System.out.println("Result: " + evalRPN);
    }
}
