package linkedlists;

public class MyLinkedList {

    private Node head; // first node
    private Node tail; // last node

    // OUTER CONSTRUCTOR
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // DISPLAY THE NODES IN THE LINKEDLIST
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // INSERT ELEMENT AT THE LAST NODE.
    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
            return;
        }
        // create a node
        Node node = new Node(value);
        tail.next = node;
        tail = node;

    }

    public void insertFirst(int value) {
        // create a node
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

    }

    // GET MIN AND MAX NODES

    public int getMin() {

        Node min = head;
        Node temp = head;
        while (temp.next != null) {
            if (temp.value < min.value) {
                min = temp;
            }
            temp = temp.next;
        }

        return min.value;
    }

    public static MyLinkedList merge(MyLinkedList ll1, MyLinkedList ll2) {
        MyLinkedList main = new MyLinkedList();
        Node hFirst = ll1.head;
        Node hSecond = ll2.head;

        while (hFirst != null && hSecond != null) {
            if (hFirst.value < hSecond.value) {
                main.insertLast(hFirst.value);
                hFirst = hFirst.next;
            } else {
                main.insertLast(hSecond.value);
                hSecond = hSecond.next;
            }
        }

        while (hFirst != null) {
            main.insertLast(hFirst.value);
            hFirst = hFirst.next;
        }

        while (hSecond != null) {
            main.insertLast(hSecond.value);
            hSecond = hSecond.next;
        }

        return main;
    }

    public void removeduplicates() {
        Node temp = head;
        // while (temp.next != null) {
        // if (temp.value == temp.next.value) {
        // temp.value = temp.next.next.value;
        // } else {
        // temp = temp.next;
        // }
        // }

        for (temp = head; temp.next != null; temp = temp.next) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;

    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                arr[max] = arr[i];
                return arr[max];
            }
        }
        return 0;

    }

    public int getMax() {

        Node max = head;
        Node temp = head;
        while (temp.next != null) {
            if (temp.value > max.value) {
                max = temp;
            }
            temp = temp.next;
        }

        return max.value;
    }

    // INNER CLASS
    private class Node {
        private int value;
        private Node next;

        // constructor
        public Node(int value) {
            this.value = value;
        }

        // constructor 2
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
