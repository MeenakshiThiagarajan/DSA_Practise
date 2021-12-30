package com.bumblebee.week4.linkedlist;

import org.junit.Test;

public class ReverseLinkedList {

    public class Node{

        int value;
        Node next;

        Node(int key){
            this.value = key;
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
    // reverse the node
    public Node reverseNode(Node node) {
        Node curr = node, prev = null, next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    @Test
    public void test1() {
        Node head = addNode(10);
        head.next = addNode(14);
        head.next.next = addNode(6);
        head.next.next.next = addNode(23);

        Node reverseNode = reverseNode(head);
        printAllNodes(reverseNode);

    }
}
