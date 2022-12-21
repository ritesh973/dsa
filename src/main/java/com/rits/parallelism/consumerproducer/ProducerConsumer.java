package com.rits.parallelism.consumerproducer;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/05/22
 */
public class ProducerConsumer {
    private static int count;
    private static int[] buffer;

    private static Object lock = new Object();

    static class Producer{
        void produce(){
            synchronized (lock) {
                if (isFull(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[count++] = 1;
                lock.notify();
            }
        }

        private boolean isFull(int[] buffer) {
            return count == buffer.length;
        }

    }
    static class Consumer{
        void consume(){
            synchronized (lock) {
                if (isEmpty(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                buffer[--count] = 0;
                lock.notify();
            }
        }

        private boolean isEmpty(int[] buffer) {
            return count == 0;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        buffer = new int[10];
        count = 0;
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable produceTask = ()->{
            for (int i = 0; i < 50; i++) {
                producer.produce();
            }
            System.out.println("Done producing");
        };
        Runnable consumeTask = ()->{
            for (int i = 0; i < 50; i++) {
                consumer.consume();
            }
            System.out.println("Done consuming");
        };

        Thread consumerThread = new Thread(consumeTask);
        Thread producerThread = new Thread(produceTask);

        consumerThread.start();
        producerThread.start();

        consumerThread.join();
        producerThread.join();

        System.out.println("Data in the Buffer "+count);

    }

}
