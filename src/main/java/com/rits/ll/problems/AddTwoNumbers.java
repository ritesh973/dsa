package com.rits.ll.problems;


/**
 * @author rits
 * @created on 16/06/2023
 * @project dsa
 */
public class AddTwoNumbers {
     static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int carry = 0;
         ListNode ans = null;
         while (l1 != null && l2 != null){
             int tempRes = l1.val+l2.val+carry;
             carry = tempRes/10;
             ans = insertAtTail(tempRes%10,ans);
             l1 = l1.next;
             l2 = l2.next;
         }
        while (l1 != null){
            int tempRes = l1.val+carry;
            carry = tempRes/10;
            ans = insertAtTail(tempRes%10,ans);
            l1 = l1.next;
        }
        while (l2 != null){
            int tempRes = l2.val+carry;
            carry = tempRes/10;
            ans = insertAtTail(tempRes%10,ans);
            l2 = l2.next;
        }
         int data = carry;
         while (carry > 0){
             carry = carry/10;
             ans = this.insertAtTail(data%10,ans);
         }

        return ans;
    }
    public ListNode insertAtTail(int newVal,ListNode head) {
        if (head == null) {
            return new ListNode(newVal);
        }
        ListNode current = new ListNode(newVal);
        current.next = null;
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = current;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;

        ListNode k1 = new ListNode(9);
        ListNode k2 = new ListNode(10);
       //ListNode k3 = new ListNode();
        k1.next = k2;
       // k2.next = k3;
        AddTwoNumbers add = new AddTwoNumbers();
        ListNode listNode = add.addTwoNumbers(n1, k1);

        while (listNode != null){
            System.out.print(listNode.val +", ");
            listNode = listNode.next;
        }

    }

}
