package com.rits.leetcode.leetcode200_300;

import java.util.Stack;

/**
 * @author rits
 * @created on 06/01/2024
 * @project dsa
 */
public class LTC224 {
    public static int calculate(String s) {
        Stack<Integer> calcStack = new Stack<>();
        int number=0;
        int sign = 1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                number = (number*10) + (c - '0');
            }else if (c == '+' ){
                result += sign*number;
                number = 0;
                sign = 1;
            }else if (c == '-'){
                result += sign*number;
                number = 0;
                sign = -1;
            }else if (c == '('){
                calcStack.push(result);
                calcStack.push(sign);
                result = 0;
                number = 0;
                sign = 1;
            }else if (c == ')'){
                result = result +(number*sign);
                number = 0;
                int stack_sign = calcStack.peek();
                calcStack.pop();
                int stack_result = calcStack.peek();
                calcStack.pop();

                result *= stack_sign;
                result += stack_result;
            }

        }
        result += number*sign;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("10+(20+30 )"));
    }
}
