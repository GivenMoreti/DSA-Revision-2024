package PracticeSemesterTest.LinkedLists;

public class MySecondLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public MySecondLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // custom methods
    // insert
    // at the end

    public void append(T item) {
        // create node
        Node<T> node = new Node<T>(item);
        if (head == null) {
            head = node;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

        // another way is using the tail
        // tail.next = node;
        // tail = node;

    }

    // insert at the beginning
    public void prepend(T item) {
        Node<T> node = new Node<T>(item);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }

    }

    public String toString() {
        String res = "[";
        Node<T> temp = head;

        while (temp != null) {
            res += temp.element;
            if (temp.next != null) {
                res += ",";
            }

            temp = temp.next;
        }
        res += "]";
        return res;
    }

    // delete

    // sort

    // merge

    // swap

    // contains
    private class Node<T> {
        T element;
        Node<T> next;

        // constructor
        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

}
