package linkedlists;

public class LL<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LL() {
        this.head = null;
        this.tail = null;
        length = 0;
    }
    /* STACK METHODS */

    // push - ADD AT THE TOP
    public void push(T value) {
        Node<T> temp = new Node<T>(value);
        temp.next = head;
        head = temp;
        length++;
    }

    // pop - REMOVE AT THE TOP
    public T pop() {
        if (head == null) {
            return null;
        }

        //
        T res = head.value;
        head = head.next;
        length--;
        return res;
    }

    /* LINKEDLISTS METHODS */
    // toString
    public String toString() {
        Node<T> temp = head;

        String res = "[";
        while (temp != null) {
            res += temp.value;

            if (temp.next != null) {
                res += ",";
            }
            temp = temp.next;
        }
        res += "]";
        return res;
    }

    // prepend
    public void prepend(T value) {
        Node<T> node = new Node<T>(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    // clear
    public void clear() {

    }

    // get first
    public void getFirst() {

    }

    // get last
    public void getLast() {

    }

    // append
    public void append(T value) {

        if (tail == null) {
            prepend(value);
            return;
        }
        // create node
        Node<T> node = new Node<T>(value);

        tail.next = node;
        tail = node;

    }

    // insert at index
    public void insert(int index, T value) {
        Node<T> node = new Node<T>(value);

        if (index == 1) {
            // we are inserting at the head
            prepend(value);
        } else {
            Node<T> prev = head;
            int count = 1;
            while (count < index - 1) {
                prev = prev.next;
                count++;
            }
            Node<T> current = prev.next;
            prev.next = node;
            node.next = current;
        }
    }

    // delete

    // reverse

    private class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

    }

}
