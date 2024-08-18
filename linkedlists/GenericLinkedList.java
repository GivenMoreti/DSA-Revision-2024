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

    public void prepend(T element) {
        Node<T> node = new Node<>(element);
        node.next = head;
        head = node;

        // EMPTY LIST
        if (tail == null) {
            tail = head;
        }
    }

    // get min and max
    public T getMin() {
        Node min = head;
        Node temp = head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(min.element) < 1) {
                min = temp;
            }
            temp = temp.next;
        }
        return (T) min.element;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public T getMax() {
        Node max = head;
        Node temp = head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(max.element) >= 1) {
                max = temp;
            }
            temp = temp.next;
        }
        return (T) max.element;
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
