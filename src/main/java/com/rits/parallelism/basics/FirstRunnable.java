package com.rits.parallelism.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/05/22
 */
public class FirstRunnable {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("I am running from Thread "+Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable);
        thread.setName("Ritesh");
        //thread.run();
        thread.start();
    }
}
