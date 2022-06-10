package com.bridgelabz.linklist;

public class LinklistByAdding {

    public static void main(String[] args)
    {
        /* Start with the empty list. */
        SimpleLinkList list = new SimpleLinkList();

          list.head  = new SimpleLinkList.Node(30);
        SimpleLinkList.Node second = new SimpleLinkList.Node(56);
        SimpleLinkList.Node third = new SimpleLinkList.Node(70);

        list.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
        list.display();
    }
}

