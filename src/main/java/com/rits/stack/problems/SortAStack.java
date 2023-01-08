package com.rits.stack.problems;

import com.rits.stack.DynamicArrayStack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 08/01/23
 */
public class SortAStack {

    public static void sortStack(DynamicArrayStack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int num = stack.pop();
        sortStack(stack);
        sortedInsert(stack,num);
    }

    private static void sortedInsert(DynamicArrayStack<Integer> stack, int num) {
        if (stack.isEmpty() || (!stack.isEmpty() && stack.top() < num)){
            stack.push(num);
            return;
        }
        Integer temp = stack.pop();
        sortedInsert(stack,num);
        stack.push(temp);
    }

    public static void main(String[] args) {
        DynamicArrayStack<Integer> stack = new DynamicArrayStack<>();
        stack.push(8);
        stack.push(1);
        stack.push(5);
        stack.push(12);
        stack.forEach(System.out::println);
        sortStack(stack);
        System.out.println();
        stack.forEach(System.out::println);
    }
}
