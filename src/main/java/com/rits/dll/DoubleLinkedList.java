package com.rits.dll;

import com.rits.common.DNode;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 15/04/22
 */
public class DoubleLinkedList<Item> {
    private DNode<Item> head;

    public void insertAtHead(int data) {
        DNode newNode = new DNode(data);
        newNode.setNext(head);
        newNode.setPrev(null);
        if (this.head != null) {
            head.setPrev(newNode);
        }
        head = newNode;
    }

    public void insertAtTail(int data) {
        DNode newNode = new DNode(data);
        newNode.setNext(null);
        if (head == null) {
            newNode.setPrev(null);
            head = newNode;
            return;
        }
        DNode last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(newNode);
        newNode.setPrev(last);
    }

    public void insertAfter(int position, int data) {
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        DNode temp = head;
        int cnt = 1;
        while (cnt < position - 1 && temp.getNext() != null) {
            temp = temp.getNext();
            cnt++;
        }
        if (temp.getNext() == null) {
            insertAtTail(data);
            return;
        }
        DNode newNode = new DNode(data);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.getNext().setPrev(newNode);

    }

    public Item delete(Item key) {
        DNode nodeToDelete = head;
        //Head
        if (nodeToDelete.getData().equals(key)){
            head = nodeToDelete.getNext();
            head.setPrev(null);
            nodeToDelete.setNext(null);
            return (Item) nodeToDelete.getData();
        }
        //Middle and Last
        DNode prev;
        while (nodeToDelete.getNext() != null){
            nodeToDelete = nodeToDelete.getNext();
            prev = nodeToDelete.getPrev();
            if (nodeToDelete.getData().equals(key)){
                prev.setNext(nodeToDelete.getNext());
                if (prev.getNext() != null){
                    prev.getNext().setPrev(prev);
                }
                return (Item) nodeToDelete.getData();
            }
        }
        return null;
    }

    public void printDLL() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }


}
