package Linkedlist.LinkedListPrepend02;

import java.util.LinkedList;

public class UseMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.prepend(30);
        list.prepend(20);
        list.prepend(10);

        list.printList();
    }
}
