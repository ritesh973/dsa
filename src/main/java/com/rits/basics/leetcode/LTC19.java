package com.rits.basics.leetcode;

import com.rits.common.ListNode;

/**
 * @author rits
 * @created on 23/08/2023
 * @project dsa
 */
public class LTC19 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int totalNodeCount = countNode(head);
        if (totalNodeCount == 1 && n == 1) return null;

        int traversed = 0;
        int nodeToBeRemoved = (totalNodeCount-n)+1;
        ListNode prev = head;
        ListNode curr = head;
        while (curr.next != null){
            if (traversed == nodeToBeRemoved)
                break;
            prev = curr;
            curr = curr.next;
            traversed++;
        }
        if (prev == head){
            head = head.next;
        }else {
            prev.next = curr.next;
        }
        return head;
    }

    public static ListNode removeNthFromEndFast(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        while (n-- > 0){
            fast = fast.next;
        }
        while (fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next;

        }
        if (slow == null || slow.next == null) return null;
        else if (slow == head && fast == null) head = head.next;
        else slow.next = slow.next.next;
        return head;

    }
    public static int countNode(ListNode head){
         int nodeCount = 1;
         if (head == null) return nodeCount-1;
         if (head.next == null) return nodeCount;

         ListNode temp = head;
         while (temp.next != null){
             nodeCount++;
             temp = temp.next;
         }
         return nodeCount;
    }
    public static void main(String[] args) {
         ListNode listNode = new ListNode(1);
         listNode.next= new ListNode(2);
        ListNode listNode1 = removeNthFromEnd(listNode, 2);
        while (listNode1.next != null){
            System.out.print(listNode1.val + " ");
            listNode1 = listNode.next;
        }
        System.out.print(listNode1.val + " ");
        System.out.println();

    }
}
