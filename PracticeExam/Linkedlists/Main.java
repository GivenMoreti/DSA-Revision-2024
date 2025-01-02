package PracticeExam.Linkedlists;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.append(45);
        list.append(34);
        list.append(99);

        list.prepend(333);
        System.out.println(list);

        list.insert(2, 1000);
        System.out.println(list);

        int count = 0;
        for (int i = 1; i <= 300; i++) {
            count += i;
        }
        System.out.println("Sum is: " + count);

        // list.delete(333);
        // System.out.println(list);
        System.out.println(sum(5));
        System.out.println(fact(5));
    
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
