package com.rits.leetcode.lettcode1000_1100;

import java.util.Stack;

/**
 * @author rits
 * @created on 06/01/2024
 * @project dsa
 */
public class LTC1047 {
    public static String  removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbccb"));
    }
}
