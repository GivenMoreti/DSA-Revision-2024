package linkedlists;

public class Main {

    public static void main(String[] args) throws Exception {

        MyThirdLinkedList<Integer> list = new MyThirdLinkedList<>();
        list.append(23);
        list.append(88);
        list.append(1);
        list.append(3);
        list.append(8);
        list.append(2);
        list.append(1);

        System.out.println("size: " + list.getSize());
        System.out.println(list);

        list.deleteStart();
        System.out.println("Last element: " + list.getLast());
        System.out.println(list);
        System.out.println(list.contains(88));
        // should return all the elements larger than 3
        System.out.println("Larger than 3: " + list.returnLarger(list, 3));
        System.out.println("Smaller than 3: " + list.returnSmaller(list, 3));
        System.out.println(list);
        System.out.println(list.betweenElements(list, 1, 88));
        System.out.println("Uniques: " + list.getUnique(list));

    }

}
