package com.rits.common;

import java.util.Iterator;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 22/12/22
 */
public class ListIterator<Item> implements Iterator<Item> {

    Node current;

    public ListIterator(Node current){
        this.current = current;
    }

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
