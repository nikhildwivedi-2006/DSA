package Linkedlist.LinkedListAppend01;

public class LinkedList {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int x) {

        Node p = new Node(x);

        if (head == null) {
            head = p;
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(p);
    }

    public void printList() {

        if (head == null) {
            System.out.println("list is empty : ");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
