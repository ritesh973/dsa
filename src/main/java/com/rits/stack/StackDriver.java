package com.rits.stack;


/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/04/22
 */
public class StackDriver {
    public static void main(String[] args) {
        System.out.println("---Array Based Stack Impl-----");
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
        System.out.println("---Linked List Based Stack Impl-----");

        LlStack<Integer> llStack = new LlStack<>();
        llStack.push(10);
        llStack.push(20);
        llStack.push(23);
        llStack.pop();
        for (Integer data: llStack) {
            System.out.println(data);
        }

    }
}
