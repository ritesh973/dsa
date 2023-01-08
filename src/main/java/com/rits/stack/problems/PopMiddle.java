package com.rits.stack.problems;

import com.rits.stack.DynamicArrayStack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 08/01/23
 */
public class PopMiddle {

    static void popMiddle(DynamicArrayStack<String> stack, int size, int count){
        if (count == size/2){
            stack.pop();
            return;
        }
        String temp = stack.pop();
        popMiddle(stack,size,count+1);
        stack.push(temp);
    }

    public static void main(String[] args) {
        DynamicArrayStack<String> stack = new DynamicArrayStack<>();
        stack.push("R1");
        stack.push("R2");
        stack.push("R3");
        stack.push("R4");
        stack.push("R5");
        popMiddle(stack,stack.size(),0);
        stack.forEach(System.out::println);



    }
}
