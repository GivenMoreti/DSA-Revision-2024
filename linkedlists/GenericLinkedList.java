package linkedlists;

public class GenericLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    // OUTER CONSTRUCTOR
    public GenericLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // INNER CLASS
    private class Node<T> {
        T element;
        Node<T> next;

        // constructors
        public Node(T element) {
            this.element = element;
            this.next = null;
        }

        // append method
        public void append(T element) {

            Node node = new Node<>(element); // node is the address

            // if the linkedlist is empty
            if (head == null) {
                // append(element);
                // return;
                head = tail = node;
            } else {

                tail.next = node;
                tail = node; // tail is now on the last node

            }
        }
    }

}
