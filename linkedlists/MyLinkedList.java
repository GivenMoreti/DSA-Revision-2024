package linkedlists;

public class MyLinkedList {

    private Node head; // first node
    private Node tail; // last node
    private int size; // number of nodes

    // OUTER CONSTRUCTOR
    public MyLinkedList() {
        this.size = 0;
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
            size++;
        }

        public void insertFirst(int value) {
            // create a node
            Node node = new Node(value);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
            size++;
        }

    }

}
