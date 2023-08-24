package com.rits.basics.leetcode;

import com.rits.common.ListNode;

/**
 * @author rits
 * @created on 24/08/2023
 * @project dsa
 */
public class LTC21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        while (list1 != null) {
            head.next = list1;
            head = head.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            head.next = list2;
            head = head.next;
            list2 = list2.next;
        }
        return temp.next;
    }
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

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(10);
        ListNode listNode = mergeTwoListsRecursive(head1, head2);
        while (listNode.next != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();


    }
}
