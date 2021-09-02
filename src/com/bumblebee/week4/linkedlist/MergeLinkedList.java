package com.bumblebee.week4.linkedlist;

/*
*
*  *
 * currentNode1 is of linked list 1
 * currentNode2 is of linked list 2


 *
if(currentNode1.next ==null)
CurrentNode3 = add(currentNode2)
currentNode2 = CurrentNode2.next
currentNode1.value<currentNode2.value ->
Add currentNode1 value to new node
CurrentNode3 = add(currentNode1)
CurrentNode1 = currentNode1.next



if(currentNode2.next ==null)
CurrentNode3 = add(currentNode1)
currentNode1 = CurrentNode1.next
currentNode2.value<currentNode1.value ->
Add currentNode2 value  to new node
CurrentNode3 = add(currentNode2)
CurrentNode2 = currentNode2.next
*
* */

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class MergeLinkedList {

    public class Node{
        int value;
        Node next;
        Node(int key){
            this.value = key;
            next = null;
        }

        Node(){
            next = null;
        }
    }
    public Node addNode(int key) {
        return new Node(key);
    }


    public void printAllNodes(Node node) {
        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public Node printOddNodes(Node node) {
        Node oddNode = new Node();
        Node current = oddNode;


        while(node != null) {
            current.next = node;
            if(node.next != null) {
                node = node.next.next;
                current = current.next;
            }
            else {
                current.next.next = null;
                break;
            }

        }
        return oddNode.next;
    }

    public void mergeAllNodes(LinkedList lst1, LinkedList lst2) {
       /* Node currentNode1 = lst1.getFirst();
        while(currenNode1 != null) {
            System.out.println(node.value);
            node = node.next;
        }*/
    }

    @Test
    public void test1() {
        Node head = addNode(1);
        head.next = addNode(2);
        head.next.next = addNode(3);
        head.next.next.next = addNode(4);
        head.next.next.next.next = addNode(5);
        head.next.next.next.next.next = addNode(6);
        printAllNodes(printOddNodes(head));
    }

}
