package AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("universityBean")
public class University {
    private List<Student> students = new ArrayList<>();
    public void addStudents(){
        Student st1 = new Student("sanya",3,8);
        Student st2 = new Student("david",2,9);
        Student st3 = new Student("lera",2,2);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("students from getstudents");
        System.out.println(students);
        return students;
    }
}
