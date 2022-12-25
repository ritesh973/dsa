package com.rits.ll;

import com.rits.common.ListIterator;
import com.rits.common.Node;

import java.util.Iterator;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 11/04/22
 */
public class SingleLinkedList<Item> implements Iterable<Item>{

    Node head;

    public void insertAtHead(int data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }
    public void insertAtTail(int newVal){
        if (head == null){
            head = new Node(newVal);
            return;
        }
        Node current = new Node(newVal);
        current.setNext(null);
        Node last = head;
        while (last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(current);
    }
    public void insertAt(int position,int newVal){
        if (position == 1){
            insertAtHead(newVal);
            return;
        }
        Node prev = head;
        int count = 1;
        while (count < position-1 && prev.getNext() != null){
            prev = prev.getNext();
            count++;
        }
        if (prev.getNext() == null){
            insertAtTail(newVal);
            return;
        }

        Node nodeToInsert = new Node(newVal);
        nodeToInsert.setNext(prev.getNext());
        prev.setNext(nodeToInsert);
    }

    public void printList(){
        Node myNode = head;
        while (myNode != null){
            System.out.println(myNode.getItem() +" ");
            myNode = myNode.getNext();
        }
    }
    public void delete(int data){
        Node temp = head;
        if (temp.getItem().equals(data)){
            head = head.getNext();
            return;
        }
        Node prevNode = temp;
        while (temp != null){
            if (temp.getItem().equals(data)){
                prevNode.setNext(temp.getNext());
                break;
            }
            prevNode = temp;
            temp = temp.getNext();

        }
    }


    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<>(head);
    }
}
