package com.rits.stack.problems;

import com.rits.stack.DynamicArrayStack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 08/01/23
 */
public class ReverseStackUsingRecursion {

    public static void reverse(DynamicArrayStack<String> stack){
        if (stack.isEmpty()){
            return;
        }
        String side = stack.pop();
        reverse(stack);
        PushInBottomOfStack.pushInBottom(stack,side);

    }

        public static void main(String[] args) {
            DynamicArrayStack<String> stack = new DynamicArrayStack<>();
            stack.push("R1");
            stack.push("R2");
            stack.push("R3");
            stack.push("R4");
            stack.push("R5");
            stack.forEach(System.out::println);
            reverse(stack);
            System.out.println();
            stack.forEach(System.out::println);
    }
}
