package com.rits.bag;

import com.rits.common.ListIterator;
import com.rits.common.Node;

import java.util.Iterator;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/12/22
 */
public class LlBag<Item> implements Iterable<Item> {

    private Node head;
    private int N;

    public void add(Item item){
        Node oldNode = head;
        head = new Node();
        head.setItem(item);
        head.setNext(oldNode);
        N++;
    }
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return head == null;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<>(head);
    }
}
