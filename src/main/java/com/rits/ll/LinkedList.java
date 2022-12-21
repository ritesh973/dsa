package com.rits.ll;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 11/04/22
 */
public class LinkedList {

    Node head;

    public void push(int data){
        Node node = new Node(data);
        node.setNext(head);
        head = node;

    }
    public void insertAt(Node preNode,int newVal){
        if (preNode == null){
            System.out.println("Prev node seems to be empty");
            return;
        }
        Node current = new Node(newVal);
        current.setNext(preNode.getNext());
        preNode.setNext(current);
    }
    public void append(int newVal){
        if (head == null){
            head = new Node(newVal);
            return;
        }
        Node current = new Node(newVal);
        current.setNext(null);
        Node last = head;
        while (last.next != null){
            last = last.getNext();
        }
        last.setNext(current);
        return;
    }
    public void printList(){
        Node myNode = head;
        while (myNode != null){
            System.out.println(myNode.getData() +" ");
            myNode = myNode.getNext();
        }
    }
    public void delete(int data){
        Node temp = head;
        if (temp.getData() == data){
            return;
        }
        Node prevNode = temp;
        while (temp != null){
            if (temp.getData() == data){
                prevNode.setNext(temp.getNext());
                break;
            }
            prevNode = temp;
            temp = temp.getNext();

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.push(30);
        ll.delete(10);
        ll.delete(20);
        ll.push(90);
        ll.printList();
    }

}
