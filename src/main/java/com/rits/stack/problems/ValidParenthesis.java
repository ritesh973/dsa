package com.rits.stack.problems;

import com.rits.stack.DynamicArrayStack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 08/01/23
 */
public class ValidParenthesis {
    public static boolean checkIfValidParenthesis(String s){
        char[] chars = s.toCharArray();
        DynamicArrayStack<Character> stack = new DynamicArrayStack<>();
        for (char ch:chars
             ) {
            if (ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else{
                if (!stack.isEmpty()){
                    Character pop = stack.top();
                    if (matches(pop,ch)){
                        stack.pop();
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();


    }

    private static boolean matches(Character pop, char ch) {
        return (ch == '}' && pop == '{') || (ch == ']' && pop == '[') || (ch == ')' && pop == '(');
    }

    public static void main(String[] args) {
        String s = "{[{}]}";
        System.out.println(checkIfValidParenthesis(s));


    }
}
