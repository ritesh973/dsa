package com.rits.parallelism.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/05/22
 */
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable runnable = ()->{
            for (int i = 0; i <1_000 ; i++) {
                longWrapper.incrementValue(i);
            }
        };
        Thread[] thread = new Thread[1_00];
        for (int i = 0; i <thread.length ; i++) {
           thread[i] = new Thread(runnable);
           thread[i].start();
        }
        for (int i = 0; i <thread.length ; i++) {
            thread[i].join();
        }
        System.out.println("Value "+longWrapper.getL());
    }
}
