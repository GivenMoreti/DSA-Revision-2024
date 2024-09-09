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

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // A single node or empty list is a palindrome
        }
    
        Node<T> temp = head;

    
        // Helper method to find the nth node from the end (for traversal)
        int size = getSize();
        
        for (int i = 0; i < size / 2; i++) {
            // Compare elements of temp (from the start) and last (from the end)
            if (!temp.element.equals(getNthFromEnd(i + 1).element)) {
                return false; // If any element mismatch, it's not a palindrome
            }
            temp = temp.next; // Move temp forward
        }
    
        return true; // If all elements match, it's a palindrome
    }
    
    private int getSize() {
        Node<T> current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    
    private Node<T> getNthFromEnd(int n) {
        Node<T> current = head;
        int target = getSize() - n;
        for (int i = 0; i < target; i++) {
            current = current.next;
        }
        return current;
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
