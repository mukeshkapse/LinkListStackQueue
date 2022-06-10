package com.bridgelabz.linklist;
import java.util.*;

public class SimpleLinkList {

        Node head;  // head of list
        static class Node {
            int data;
            Node next;
            Node(int d)  { data = d;  next=null; }
        }
        /* This function prints contents of the linked list starting from head */
        public void display()
        {
            Node n = head;
            while (n != null)
            {
                System.out.print(n.data+" \n");
                n = n.next;
            }
        }
        /* method to create a simple linked list with 3 nodes*/
        public static void main(String[] args)
        {
            /* Start with the empty list. */
            SimpleLinkList list = new SimpleLinkList();

            list.head       = new Node(56);
            Node second      = new Node(30);
            Node third       = new Node(70);

            list.head.next = second; // Link first node with the second node
            second.next = third; // Link first node with the second node
            list.display();
        }
    }

