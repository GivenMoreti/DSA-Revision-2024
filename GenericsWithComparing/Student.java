package GenericsWithComparing;

public class Student implements Comparable<Student> {

    int rollNum;
    int marks;

    public Student(int rollNo, int marks) {
        this.rollNum = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = o.marks - this.marks;
        return diff;

    }

    public static void main(String[] args) {
        Student stu = new Student(2, 34);
        Student stu2 = new Student(3, 84);

        if (stu.compareTo(stu2) > 0) {
            System.out.printf("%s is greater than %s", stu.marks, stu2.marks);
        } else if (stu.compareTo(stu2) < 0) {
            System.out.println("stu2 is less than stu");
        } else {
            System.out.println("stu2 is equal to stu");
        }

    }

}
