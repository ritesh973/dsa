package com.rits.stack;

import com.rits.common.ListIterator;
import com.rits.common.Node;

import java.util.Iterator;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/12/22
 */
public class LlStack<Item> implements Iterable<Item> {

    private Node head;
    private int N;

    public void push(Item item){
        Node node = new Node(item);
        node.setNext(head);
        head = node;
        N++;
    }
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public Item pop(){
        Item item = (Item) head.getItem();
        head = head.getNext();
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<>(head);
    }
}
