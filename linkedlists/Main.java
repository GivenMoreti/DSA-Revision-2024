package linkedlists;

public class Main {

    public static void main(String[] args) throws Exception {

        MyThirdLinkedList<Integer> list = new MyThirdLinkedList<>();
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        MyThirdLinkedList<Integer> paramList = new MyThirdLinkedList<>();
        paramList.append(5);
        MyThirdLinkedList<Integer> rList = new MyThirdLinkedList<>();

        //rList = list.sharedElements(paramList);
        System.out.println(rList);

        // System.out.println("size: " + list.getSize());
        // System.out.println(list);

        // list.deleteStart();
        // System.out.println("Last element: " + list.getLast());
        // System.out.println(list);
        // System.out.println(list.contains(88));
        // // should return all the elements larger than 3
        // System.out.println("Larger than 3: " + list.returnLarger(list, 3));
        // System.out.println("Smaller than 3: " + list.returnSmaller(list, 3));
        // System.out.println(list);
        // System.out.println(list.betweenElements(list, 1, 88));
        // System.out.println("Uniques: " + list.getUnique(list));

        // // test the merge method

        // MyThirdLinkedList<Integer> mList = new MyThirdLinkedList<>();
        // mList.append(23);
        // mList.append(7);
        // mList.append(9);
        // System.out.println(mList);

        // MyThirdLinkedList<Integer> mList2 = new MyThirdLinkedList<>();
        // mList2.append(19);
        // mList2.append(1);
        // mList2.append(16);
        // mList2.append(40);

        // System.out.println(mList2);
        // MyThirdLinkedList<Integer> mergeList = new MyThirdLinkedList<>();

        // mergeList = mergeList.merge(mList, mList2);

        // System.out.println("Merged List: " + mergeList);

    }

}
