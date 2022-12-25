package com.rits.common;


/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 24/12/22
 */
public class DNode<Item> {

    private Item data;
    private DNode prev;
    private DNode next;

    public DNode(Item data) {
        this.data = data;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
}
