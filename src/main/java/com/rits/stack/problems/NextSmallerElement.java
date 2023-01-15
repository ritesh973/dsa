package com.rits.stack.problems;

import com.rits.stack.DynamicArrayStack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 09/01/23
 */
public class NextSmallerElement {

    public static List<Integer> nextSmallestEle(List<Integer> list,int n){
        DynamicArrayStack<Integer> stack = new DynamicArrayStack<>();
        stack.push(-1);
        List<Integer> ans = new ArrayList<>();
        for (int i = n-1; i >0 ; i--) {
            int curr = list.get(i);
            while (stack.top() >= curr){
                stack.pop();
            }
            ans.add(stack.top());
            stack.push(curr);
        }
        return ans;
        
    }
}
