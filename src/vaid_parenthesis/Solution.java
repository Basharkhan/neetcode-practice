package vaid_parenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Map<Character, Character>  bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // check if opening bracket
            if (!bracketMap.containsKey(ch)) {
                stack.push(ch);
            } else if (!stack.isEmpty() && bracketMap.get(ch).equals(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }
}
