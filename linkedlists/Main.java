package linkedlists;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        // behaves like a stack LIFO
        ll.insertFirst(23);
        ll.insertFirst(3);
        ll.insertFirst(12);
        ll.insertFirst(24);
        ll.display();

    }
}
