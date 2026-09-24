package Linkedlist.LinkedListAppend01;

public class UseLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.printList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        list.printList();

    }
}
