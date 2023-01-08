package com.rits.stack.problems;

import com.rits.stack.DynamicArrayStack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 08/01/23
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Ritesh";
        DynamicArrayStack<Character> stack = new DynamicArrayStack<>();
        char[] chars = str.toCharArray();
        for (char ch:chars
             ) {
            stack.push(ch);
        }
        String reverse = "";
        for (Character data: stack
             ) {
            reverse = reverse+data;
        }
        System.out.println(reverse);



    }
}
