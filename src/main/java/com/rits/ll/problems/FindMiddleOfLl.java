package com.rits.ll.problems;

import com.rits.common.Node;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 26/12/22
 */
public class FindMiddleOfLl {

    public static int getSize(Node head) {
        Node temp = head;
        int size = 0;
        while (temp != null){
            temp = temp.getNext();
            size++;
        }
        return size;
    }
    public static Node getMiddle(Node head) {
        int size = getSize(head);
        int mid = size/2;
        int cnt = 0;
        while (cnt < mid){
            head = head.getNext();
            cnt++;
        }
        return head;
    }

    public static Node getMiddleEfficient(Node head) {
        if (head == null || head.getNext() == null){
            return head;
        }
        if (head.getNext().getNext() == null){
            return head.getNext();
        }
        Node fast = head.getNext();
        Node slow = head;
        while (fast != null){
           fast = fast.getNext();
           if (fast != null) {
               fast = fast.getNext();
           }
           slow = slow.getNext();
        }
        return slow;
    }

}
