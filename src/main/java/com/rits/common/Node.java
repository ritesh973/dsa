package com.rits.common;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/12/22
 */
public class Node<Item>{
    Item item;
    Node next;

    public Node() {

    }

    public Node(Item data) {
        this.item = data;
        this.next = null;
    }

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
