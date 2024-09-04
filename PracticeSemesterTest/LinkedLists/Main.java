package PracticeSemesterTest.LinkedLists;

public class Main {
    public static void main(String[] args) {
        MySecondLinkedList<Integer> ll = new MySecondLinkedList<Integer>();
        //
        ll.append(43);
        ll.prepend(500);
        ll.append(23);
        System.out.println(ll);
    }
}
