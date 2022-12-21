package com.rits.stack;


/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/04/22
 */
public class StackDriver {
    public static void main(String[] args) {
        DynamicArrayStack<Integer> stack = new DynamicArrayStack<>();
        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.pop();
        stack.push(22);
        for (Integer data: stack) {
            System.out.println(data);
        }
        System.out.println(stack.size());
    }
}
