package com.rits.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/04/22
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("Ritesh");
        queue.add("Moti");
        queue.add("Rohit");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.offer("gopal"));
        System.out.println(queue);
    }
}
