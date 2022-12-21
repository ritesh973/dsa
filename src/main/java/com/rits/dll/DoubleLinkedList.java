package com.rits.dll;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 15/04/22
 */
public class DoubleLinkedList {
    Node head;

    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(this.head != null){
            head.prev = newNode;
        }
        head = newNode;
    }
    public void insertAfter(Node prev,int data){
        if (prev == null){
            System.out.println("prev node not be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    public void printDLL(Node node){
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public void delete(Node key){
        if (head == key){
            head = head.next;
        }
        if (key.next != null){
            key.next.prev = key.prev;
        }
        if (key.prev != null){
            key.prev.next = key.next;
        }


    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.push(10);
        dll.push(20);
        dll.addLast(30);
        dll.printDLL(dll.head);
    }

}
