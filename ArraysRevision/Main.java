package ArraysRevision;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        int count = 12;
        for (int i = 1; i < count; i++) {
            list.append(i * 2);
        }

        System.out.println(list);

        // implement remove method.
        // System.out.println(list.remove());
        // System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);
    }
}
