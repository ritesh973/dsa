package com.rits.ll;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 24/12/22
 */
public class SingleLinkedListDriver {
    public static void main(String[] args) {
        SingleLinkedList<Integer> ll = new SingleLinkedList<>();
        ll.insertAtHead(30);
        ll.insertAtTail(10);
        ll.insertAtTail(20);

        ll.delete(10);
        ll.delete(20);
        ll.insertAtHead(90);
        ll.insertAt(3,99);

        for (Integer data:ll
             ) {
            System.out.print(data+", ");
        }

    }
}
