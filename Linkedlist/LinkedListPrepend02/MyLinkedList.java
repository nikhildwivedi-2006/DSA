package Linkedlist.LinkedListPrepend02;

public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void prepend(int x) {

        Node p = new Node(x);

        p.setNext(head);

        head = p;
    }

    public void printList() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}
