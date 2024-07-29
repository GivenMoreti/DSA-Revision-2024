package SomeTest;

public class MyClass extends AClass implements IClass {
    public static void main(String[] args) {
        System.out.println("hello");

        AClass ac = new MyClass();
        ac.method();
        ac.method2();
    }

    public void method() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }
}
