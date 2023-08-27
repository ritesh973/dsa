package com.rits.basics.leetcode;

import com.rits.common.ListNode;

/**
 * @author rits
 * @created on 25/08/2023
 * @project dsa
 */
public class LTC24 {
    public static ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode point = dummy;

        while (point.next != null && point.next.next != null){
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;

            swap1.next = swap2.next;
            swap2.next = swap1;

            point.next = swap2;
            point = swap1;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode listNode = swapPairs(node);
        System.out.println(listNode);
    }
}
