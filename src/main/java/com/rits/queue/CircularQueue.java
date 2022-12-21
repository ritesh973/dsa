//package com.rits.queue;
//
///**
// * @author Ritesh Singh
// * @version 1.0
// * @since 16/04/22
// */
//public class CircularQueue {
//
//    static class Queue{
//        int front,rear;
//        int[] Q;
//        public Queue(int size){
//            Q = new int[size+1];
//            front = 0;
//            rear = 0;
//        }
//    }
//
//    public void enqueue(int data){
//        rear = (rear+1) % Q.length;
//        if (rear == front){
//            System.out.println("full");
//            return;
//        }
//        if(rear == 0){
//            rear = q.length-1;
//        }
//        else {
//            rear = rear-1;
//        }
//    }
//}
