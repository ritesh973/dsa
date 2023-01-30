package com.rits.heap;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 23/01/23
 */
public class HeapDriver {
    public static void main(String[] args) {
        Heap heap = new Heap(20);
        heap.insert(50);
        heap.insert(55);
        heap.insert(53);
        heap.insert(52);
        heap.insert(54);
        heap.print();
        heap.delete();
        System.out.println();
        heap.print();

    }
}
