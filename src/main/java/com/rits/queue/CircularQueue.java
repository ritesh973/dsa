package com.rits.queue;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 16/04/22
 */
public class CircularQueue {
    int front, rear;
    int[] Q;
    int size;

    public CircularQueue(int size) {
        this.size = size;
        Q = new int[size + 1];
        front = rear = -1;
    }

    public void enqueue(int data) {
        if ((front == 0 && rear == size-1) || (rear == (front-1)%(size-1)))
        {
            System.out.println("full");
            return;
        }else if (front == -1){
            front = rear = 0;
        }else if (rear == size-1 && front != 0){
            rear = 0;
        }else {
            rear++;
        }
        Q[rear] = data;

    }
    public int dQueue() {
        if (front == -1){
            System.out.println("Empty");
            return -1;
        }
        int ans = Q[front];
        if (front == rear){
            Q[front] = -1;
            front = rear = -1;
            return ans;
        }else if (front == size-1){
            front = 0;
        }else {
            front++;
        }
        return ans;

    }
}
