package PracticeExam.Arraylists;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println("Size: " + list.getSize());
        System.out.println(list);

        list.append(33);
        System.out.println("Size: " + list.getSize());
        System.out.println(list);

        list.append(11);
        System.out.println("Size: " + list.getSize());
        System.out.println(list);

        list.prepend(190);
        System.out.println("Size: " + list.getSize());
        System.out.println(list);

    }
}
