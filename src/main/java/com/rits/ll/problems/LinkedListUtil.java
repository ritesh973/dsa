package com.rits.ll.problems;

import com.rits.common.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 26/12/22
 */
public class LinkedListUtil {

    public static Node reverseLL(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node smallHead = reverseLL(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return smallHead;
    }
    public static Node reverseLLInKGroup(Node head,int k) {
        if (head == null) {
            return null;
        }
        Node next = null;
        Node curr = head;
        Node prev = null;
        int cnt = 0;
        while (curr != null && cnt < k){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
            cnt++;

        }
        if (next != null){
            head.setNext(reverseLLInKGroup(next,k));
        }
        return prev;
    }
    public static boolean isCircular(Node head) {
       if (head == null){
           return true;
       }
       Node temp = head.getNext();
       while (temp != null && temp !=head){
           temp = temp.getNext();
       }
       if (temp == null)
           return false;
       if (temp == head)
           return true;

       return false;

    }
    public static boolean detectLoop(Node head) {
        if (head == null){
            return false;
        }
        Map<Node,Boolean> visited = new HashMap<>();

        Node temp = head.getNext();
        while (temp != null){
            if (visited.get(temp)!=null && visited.get(temp) == true){
                return true;
            }
            visited.put(temp,true);
            temp = temp.getNext();
        }
        return false;

    }
    public static boolean floydDetectLoop(Node head) {
        if (head == null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null){
            fast = fast.getNext();
            if (fast != null){
                fast = fast.getNext();
            }
            slow = slow.getNext();

            if (slow == fast)
                return true;
        }
        return false;

    }
    public static Node floydDetectLoopNode(Node head) {
        if (head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null){
            fast = fast.getNext();
            if (fast != null){
                fast = fast.getNext();
            }
            slow = slow.getNext();

            if (slow == fast)
                return slow;
        }
        return null;

    }
    public static Node getStarting(Node head) {
        if (head == null){
            return null;
        }
        Node slow = head;
        Node intersection = floydDetectLoopNode(head);
        while (slow != intersection && intersection != null){
            intersection = intersection.getNext();
            slow = slow.getNext();
        }
        return slow;

    }
    public static void removeLoop(Node head) {
        if (head == null){
            return;
        }
        Node startOfLoop = getStarting(head);
        if (startOfLoop == null){
            return;
        }
        Node temp = startOfLoop;
        while (temp.getNext() != startOfLoop){
            temp = temp.getNext();

        }
        temp.setNext(null);
    }
    public static Node removeDuplicateInUnsorted(Node head) {
        if (head == null){
            return null;
        }
        Node current = head;
        while (current != null){
            if (current.getNext() != null && current.getItem().equals(current.getNext().getItem())){
                current.setNext(current.getNext().getNext());
            }else {
                current = current.getNext();

            }
        }
        return head;

    }

   /* public Node mergeSort(Node head){
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node mid = FindMiddleOfLl.getMiddle(head);
        Node left = head;
        Node right = mid.getNext();
        mid.setNext(null);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);
    }*/

    /*private Node merge(Node left, Node right) {
        if (left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        Node ans = new Node(-1);

        while (left != null && right != null){
            if (left.getItem()<right.getItem())
        }
        while (left != null){
            if ()
        }
        while (right != null){
            if ()
        }
    }*/
}
