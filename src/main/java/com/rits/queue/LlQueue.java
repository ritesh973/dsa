package com.rits.queue;

import com.rits.common.ListIterator;
import com.rits.common.Node;

import java.util.Iterator;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/12/22
 */
public class LlQueue<Item> implements Iterable<Item> {
    private Node head;
    private Node tail;
    private int N;

    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(Item item){
        Node oldNode = tail;
        tail = new Node();
        tail.setItem(item);
        tail.setNext(null);
        if (isEmpty()){
            head = tail;
        }else {
            oldNode.setNext(tail);
        }
        N++;

    }
    public Item dequeue(){
        Item item = (Item) head.getItem();
        head = head.getNext();
        N--;
        if (isEmpty()){
            tail = null;
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<>(head);
    }
}
