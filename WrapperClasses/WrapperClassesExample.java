package WrapperClasses;

public class WrapperClassesExample {
    public static void main(String[] args) {
        int num = 2;
        Integer num2 = num; // autoboxing

        int num3 = num2; // unboxing
        System.out.println(num3);

        System.out.println(num2.getClass()); // Integer

        // converting strings to integers.
        String myNum = "12";
        int num4 = Integer.parseInt(myNum);
        System.out.println(num4);
    }
}
