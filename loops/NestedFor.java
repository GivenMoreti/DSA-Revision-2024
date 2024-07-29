public class NestedFor {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("inner loop reiterates");
                System.out.println(j);
            }
        }
    }

}
