package linkedlists;

public class Main {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        // behaves like a stack LIFO
        ll.insertFirst(23);
        ll.insertFirst(3);
        ll.insertFirst(12);
        ll.insertFirst(24);
        ll.display();

        // generic linkedlist
        GenericLinkedList<Integer> genLList = new GenericLinkedList<>();
        genLList.append(new Integer(30));
        genLList.append(new Integer(26));
        genLList.append(new Integer(90));
        System.out.println(genLList);

    }
}
