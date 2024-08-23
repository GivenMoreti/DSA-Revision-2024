package linkedlists;

public class Main {

    public static void main(String[] args) throws Exception {

        LL<Integer> list = new LL<Integer>();
        list.insert(1, 23);
        list.insert(2, 3);
        list.insert(3, 53);
        list.insert(4, 45);
        list.insert(2, 333);

        System.out.println(list);
        list.append(40);
        System.out.println(list);

        // GenericLinkedList<Integer> insertAtList = new GenericLinkedList<Integer>();

        // insertAtList.insertAtIndex(1, 11);
        // insertAtList.insertAtIndex(2, 100);
        // insertAtList.insertAtIndex(3, 113);

        // insertAtList.insertAtIndex(2, 99);
        // insertAtList.insertAtIndex(3, 44);
        // System.out.println(insertAtList.getLength());
        // System.out.println(insertAtList);
        /*
         * Test for merge method
         */

        // MyLinkedList firstLL = new MyLinkedList();
        // firstLL.insertLast(1);
        // firstLL.insertLast(1);
        // firstLL.insertLast(3);
        // MyLinkedList secondLL = new MyLinkedList();
        // secondLL.insertLast(12);
        // secondLL.insertLast(4);
        // secondLL.insertLast(13);
        // secondLL.insertLast(13);

        // MyLinkedList mergedList = MyLinkedList.merge(firstLL, secondLL);

        // mergedList.display();
        // mergedList.removeduplicates();
        // mergedList.display();
        // /* TEST FOR CONTAINS */

        // GenericLinkedList<Integer> myList = new GenericLinkedList<>();
        // myList.append(23);
        // myList.append(3);
        // myList.append(45);

        // System.out.println(myList.contains(31));

        // /* TEST FOR REVERSE */

        // myList.reverse();
        // System.out.println(myList);

    }

}
