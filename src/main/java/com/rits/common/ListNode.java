package com.rits.common;

import com.rits.basics.leetcode.LTC21;

/**
 * @author rits
 * @created on 24/08/2023
 * @project dsa
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
