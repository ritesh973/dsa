package com.rits.stack;

import java.util.Iterator;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 21/12/22
 */
public class DynamicArrayStack<Item> implements Iterable<Item> {

    private Item data[] = (Item[]) new Object[1];
    private int N = 0;


    public boolean isEmpty() {
        return N == 0;
    }
    public Item top() {
        return data[N-1];
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        if (N == data.length)
            resize(2 * data.length);
        data[N++] = item;
    }

    public Item pop() {
        Item item = data[--N];
        data[N] = null;
        if (N > 0 && N == data.length / 4)
            resize(data.length / 2);
        return item;
    }

    public void resize(int max) {
        Item temp[] = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private class DynamicArrayStackIterator<Item> implements Iterator<Item> {

        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return (Item) data[--i];
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new DynamicArrayStackIterator();
    }
}
