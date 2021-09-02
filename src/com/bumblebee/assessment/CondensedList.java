package com.bumblebee.assessment;

import com.bumblebee.week4.linkedlist.MergeLinkedList;
import org.junit.Test;

import java.util.HashSet;

public class CondensedList {

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

    private Node condense(Node head) {
        // Write your code here
        Node outputNode = new Node();
        Node tmp = outputNode;
        HashSet<Integer> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head.value)){
                head = head.next;
                tmp.next = null;
            }else{
                set.add(head.value);
                tmp.next = head;
                head = head.next;
                tmp = tmp.next;
            }
        }
        return outputNode;
    }

    @Test
    public void test1() {
        Node head = addNode(1);
        head.next = addNode(2);
        head.next.next = addNode(3);
        head.next.next.next = addNode(4);
        head.next.next.next.next = addNode(3);
        head.next.next.next.next.next = addNode(4);
        printAllNodes(condense(head));
    }
}
