package Interfaces;
import java.util.HashMap;
public class StudCourse implements IPerson {
   /*
    STORES AND RETRIEVES USING KEY-VALUE PAIRS
    */
   Course course;
   Student student;
    HashMap<Student,Course> registeredStudents = new HashMap<>();

    @Override
    public void register(Student student,Course course) {
        registeredStudents.put(student,course);
        System.out.println("registered successfully");
        getAll();

    }

  @Override
  public void getAll() {
   registeredStudents.forEach((stu,course) ->{
    System.out.println(stu + " "+course);
   });
  }

  @Override
     public void deregister(Course course) {
        registeredStudents.remove(student,course);
        getAll();
     }

//    public String toString(){
//     return "course: " + this.course.name + "\nStudent: " + this.student.pName;
//    }
}
