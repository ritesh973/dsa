package com.rits.stack.problems;

import com.rits.stack.DynamicArrayStack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 08/01/23
 */
public class PushInBottomOfStack {

    public static void pushInBottom(DynamicArrayStack<String> stack, String data){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        String tempData = stack.pop();
        pushInBottom(stack,data);
        stack.push(tempData);

    }

    public static void main(String[] args) {
        DynamicArrayStack<String> stack = new DynamicArrayStack<>();
        stack.push("R1");
        stack.push("R2");
        stack.push("R3");
        stack.push("R4");
        stack.push("R5");
        pushInBottom(stack,"R9");
        stack.forEach(System.out::println);
    }
}
