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

        // get min and max values from linkedlist
        System.out.println(ll.getMin());

        System.out.println(ll.getMax());
        ll.display();

        GenericLinkedList<Integer> genList = new GenericLinkedList<>();
        genList.append(13);
        genList.append(43);
        genList.append(32);
        System.out.println(genList.getMin());
        System.out.println(genList.getMax());
        System.out.println(genList.toString());

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

}
