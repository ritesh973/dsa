package com.rits.stack;

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
    public Item pop(){
        Item item = head.getItem();
        head = head.getNext();
        N--;
        return item;
    }
    class Node{
        Item item;
        Node next;

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    private class LlStackIterator<Item> implements Iterator<Item> {

        Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = (Item) current.getItem();
            current = current.getNext();
            return item;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new LlStackIterator();
    }
}
