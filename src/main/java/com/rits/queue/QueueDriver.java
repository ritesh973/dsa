package com.rits.queue;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/04/22
 */
public class QueueDriver {
    public static void main(String[] args) {
        LlQueue<String> queue = new LlQueue<>();
        queue.enqueue("Ritesh");
        queue.enqueue("Moti");
        queue.enqueue("Rohit");
        queue.dequeue();
        for (String item : queue
             ) {
            System.out.println(item);
        }
    }
}
