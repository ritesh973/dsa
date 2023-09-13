package com.rits.leetcode.leetcode1_40;

import java.util.Stack;

/**
 * @author rits
 * @created on 05/09/2023
 * @project dsa
 */
public class LTC32 {
    public static int longestValidParentheses(String s) {
        if (s == null || s.isEmpty()) return 0;
        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                tempStack.push(i);
            } else {
                tempStack.pop();
                if (tempStack.isEmpty()){
                    tempStack.push(i);
                }else {
                    int len = i - tempStack.peek();
                    max = Integer.max(max,len);

                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
    }
}
