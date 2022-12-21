package com.rits.stack;

import java.util.Stack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/04/22
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(12);
        System.out.println(stack);
    }
}
