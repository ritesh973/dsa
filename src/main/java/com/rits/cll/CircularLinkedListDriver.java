package com.rits.cll;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 26/12/22
 */
public class CircularLinkedListDriver {
    public static void main(String[] args) {
        CircularLinkedList<Integer> cll = new CircularLinkedList<>();
        cll.insert(1,20);
        cll.insert(20,30);
        cll.insert(20,40);
        //cll.delete(40);
        cll.printList();
        System.out.println();
        System.out.println(cll.isCircular());
        cll.removeCycle();
        System.out.println();
        System.out.println(cll.isCircular());
        System.out.println();
        cll.printList();

    }
}
