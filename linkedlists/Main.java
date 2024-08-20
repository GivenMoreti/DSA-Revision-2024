package linkedlists;

public class Main {

    public static void main(String[] args) {

        /*
         * Test for merge method
         */

        MyLinkedList firstLL = new MyLinkedList();
        firstLL.insertLast(1);
        firstLL.insertLast(1);
        firstLL.insertLast(3);
        MyLinkedList secondLL = new MyLinkedList();
        secondLL.insertLast(12);
        secondLL.insertLast(4);
        secondLL.insertLast(13);
        secondLL.insertLast(13);

        MyLinkedList mergedList = MyLinkedList.merge(firstLL, secondLL);

        mergedList.display();
        mergedList.removeduplicates();
        mergedList.display();

    }

}
