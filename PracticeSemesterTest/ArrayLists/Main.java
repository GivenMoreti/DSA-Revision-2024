package PracticeSemesterTest.ArrayLists;

public class Main {
    public static void main(String[] args) {

        MyThirdArrayList<Integer> list = new MyThirdArrayList<Integer>();
        // append
        list.append(23);
        list.append(3);
        list.append(40);

        // prepend
        list.prepend(300);

        // insert

        list.insert(2, 111);
        System.out.println(list);
        /// sort
        // list.sort();
        System.out.println("size: " + list.getSize());
        list.contains(40);
        list.deleteEnd();
        System.out.println("size: " + list.getSize());
        System.out.println(list.isEmpty());

        // delete index
        //
        System.out.println(list);
        list.deleteStart();
        System.out.println(list);
        System.out.println(list.delete(2));
        System.out.println(list);
    }
}
