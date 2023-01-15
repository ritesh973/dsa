package com.rits.queue.problems;

import com.rits.queue.LlQueue;
import com.rits.stack.DynamicArrayStack;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 12/01/23
 */
public class ReverseQueue {

    public static LlQueue<Integer> reverse(LlQueue<Integer> queue){
        DynamicArrayStack<Integer> stack = new DynamicArrayStack<>();
        LlQueue<Integer> ans = new LlQueue<>();
        for (Integer i: queue
             ) {
            stack.push(i);
        }
        for (Integer data: stack
             ) {
            ans.enqueue(data);
        }
        return ans;
    }

    public static void main(String[] args) {
        LlQueue<Integer> queue = new LlQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.forEach(System.out::println);
        LlQueue<Integer> reverse = reverse(queue);
        System.out.println();
        reverse.forEach(System.out::println);


    }

}
