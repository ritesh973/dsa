package com.rits.leetcode.leetcode1_40;

import com.rits.common.ListNode;

/**
 * @author rits
 * @created on 26/08/2023
 * @project dsa
 */
public class LTC25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode tail = head;

        for (int i = 0; i < k; ++i) {
            if (tail == null) // Less than k nodes, do nothing
                return head;
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;

    }
    private static ListNode reverse(ListNode head, ListNode tail) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode listNode = reverseKGroup(head, 3);
        System.out.println(listNode);
    }

}
