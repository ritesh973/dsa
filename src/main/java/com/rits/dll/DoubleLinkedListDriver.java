package com.rits.dll;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 24/12/22
 */
public class DoubleLinkedListDriver {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> dll = new DoubleLinkedList<>();
        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtTail(33);
        dll.delete(10);
        dll.delete(20);
        dll.printDLL();

    }
}
