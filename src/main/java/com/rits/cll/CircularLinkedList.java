package com.rits.cll;

import com.rits.common.Node;
import com.rits.ll.problems.LinkedListUtil;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 26/12/22
 */
public class CircularLinkedList<Item> {

    private Node tail;

    public void insert(Item ele, Item data){
        Node newNode = new Node(data);
        if (tail == null){
            tail = newNode;
            newNode.setNext(newNode);

        }else
        {
            Node current = tail;
            while (!current.getItem().equals(ele)){
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);


        }

    }
    public void delete(Item data){

            Node prev = tail;
            Node current = prev.getNext();

            while (!current.getItem().equals(data)){
                prev = current;
                current = current.getNext();
            }
            if (current == prev){
                tail = null;
            }
            if (tail == current){
                tail = prev;
            }
            prev.setNext(current.getNext());
            current.setNext(null);


    }
    public void printList(){
        Node myNode = tail;
        if (tail == null){
            System.out.println("List is empty");
            return;
        }
        do {
            System.out.print(tail.getItem() +" ");
            tail = tail.getNext();
        } while (tail != myNode && tail != null);
    }
    public boolean isCircular(){
        System.out.println(LinkedListUtil.detectLoop(tail));
        System.out.println(LinkedListUtil.floydDetectLoop(tail));
        System.out.println(LinkedListUtil.getStarting(tail).getItem());
        return LinkedListUtil.isCircular(tail);
    }
    public void removeCycle(){
       LinkedListUtil.removeLoop(tail);
    }

}
