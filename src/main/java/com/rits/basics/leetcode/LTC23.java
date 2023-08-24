package com.rits.basics.leetcode;

import com.rits.common.ListNode;

/**
 * @author rits
 * @created on 24/08/2023
 * @project dsa
 */
public class LTC23 {

    public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode head;
        if (list1.val <=  list2.val){
            head = list1;
            head.next = mergeTwoListsRecursive(list1.next,list2);
        }else {
            head = list2;
            head.next = mergeTwoListsRecursive(list1,list2.next);
        }
        return head;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        ListNode listNode = mergeTwoListsRecursive(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            listNode = LTC21.mergeTwoListsRecursive(listNode, lists[i]);
        }
        return listNode;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(10);
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(23);
        ListNode[] listNodes = {head1,head2,head3};
        ListNode listNode = mergeKLists(listNodes);
        while (listNode.next != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();


    }
}
