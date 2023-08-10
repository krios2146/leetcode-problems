package me.krios2146.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            Character first = stack.peekFirst();
            if (first != null && isClosingParenthesis(first, s.charAt(i))) {
                stack.pollFirst();
            } else {
                stack.offerFirst(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }

    private static boolean isClosingParenthesis(char opening, char closing) {
        if (opening == '(' && closing == ')') {
            return true;
        }
        if (opening == '{' && closing == '}') {
            return true;
        }
        if (opening == '[' && closing == ']') {
            return true;
        }
        return false;
    }
}
