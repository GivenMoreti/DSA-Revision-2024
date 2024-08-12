package linkedlists;

public class GenericLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    // OUTER CONSTRUCTOR
    public GenericLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*
     * METHODS FOR THE OUTER CLASS
     */
    public void append(T element) {

        Node<T> node = new Node<>(element); // node is the address

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

    /*
     * TOSTRING METHOD FOR THE OUTER CLASS.
     */
    public String toString() {
        Node<T> ptr = head;
        String result = "[";

        while (ptr != null) {
            result += ptr.element;

            // add commas
            if (ptr.next != null) {
                result += ", ";
            }
            ptr = ptr.next;
        }
        result += "]";

        return result;
    }

    // INNER CLASS
    private class Node<T> {
        T element;
        Node<T> next;

        // inner class constructor
        public Node(T element) {
            this.element = element;
            this.next = null;
        }

    }

}
