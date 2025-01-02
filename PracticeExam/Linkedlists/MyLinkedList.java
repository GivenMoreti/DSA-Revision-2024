package PracticeExam.Linkedlists;

public class MyLinkedList<T> {
    Node<T> tail;
    Node<T> head;

    public MyLinkedList() {
        this.tail = null;
        this.head = null;
    }

    // CUSTOM METHODS.
    // to string

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

    // INSERTION

    // INSERT AT THE BEGINNING.
    public void prepend(T element) {
        Node<T> node = new Node<T>(element);
        // if the list is empty
        node.next = head;
        head = node;
        if (tail == null) {
            tail.next = node;
            tail = node;
        }
    }

    // INSERT AT THE END.
    public void append(T element) {

        Node<T> newNode = new Node<>(element); // Create a new for element e

        if (head == null) {
            head = tail = newNode; // The new node is the only node in list
        } else {
            tail.next = newNode; // Link the new with the last node
            tail = newNode; // tail now points to the last node
        }
    }

    // INSERT IN THE MIDDLE.
    // say at index 3
    public void insert(int index, T element) {

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        if (index == 1) {
            prepend(element);
        }

        Node<T> node = new Node<T>(element);
        Node<T> prev = head;
        int count = 1;

        while (count < index - 1) {
            prev = prev.next;
            count++;
        }

        Node<T> current = prev.next;
        node.next = current;
        prev.next = node;
    }

    public int getLength() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
        }
        return count;
    }

    // list constains a certain element
    public boolean contains(T element) {
        Node<T> temp = head;
        while (temp != null) {
            if (((Comparable) temp.element).compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }

  

    public boolean delete(T element) {
        Node<T> temp = head;
        Node<T> prev = null;
        while (temp != null && ((Comparable) temp.element).compareTo(element) != 0) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return false;
        }
        if (temp == tail) {
            tail = prev;
        }
        if (temp == head)
            head = head.next;

        else {
            prev.next = temp.next;

        }

        return true;
    }

    private class Node<T> {
        Node<T> next;
        T element;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}
