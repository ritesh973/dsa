package com.rits.leetcode.leetcode1_40;

import java.util.Stack;

/**
 * @author rits
 * @created on 22/08/2023
 * @project dsa
 */
public class LTC20 {
    public static boolean isValid(String s) {
        if ( s== null || s.length() == 0 || s.length() == 1 ) return false;
        char[] chars = s.toCharArray();
        Stack<Character> cStack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[' ) {
                cStack.push(chars[i]);
            }else {
                if (cStack.isEmpty()){
                    return false;
                }
                char peek = cStack.peek();
                if (checkValid(chars[i],peek)){
                    cStack.pop();
                }else {
                    return false;
                }
            }

        }
        return cStack.isEmpty();

    }
    public static  boolean  checkValid(char current,char peek){
        return (current == '}' && peek == '{') || (current == ']' && peek == '[') || (current == ')' && peek == '(');
    }

    public static void main(String[] args) {
        System.out.println(isValid("){"));

    }
}
