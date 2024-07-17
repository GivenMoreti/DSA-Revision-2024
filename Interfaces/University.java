package Interfaces;

public class University {
    public static void main(String[] args) {

        StudCourse stuCourse = new StudCourse();
        stuCourse.register(new Student("Jane"), new Course("String Theory", Faculties.science));
        System.out.println(stuCourse);

    }
}

/*
 * It is a package/directory in java.
 */