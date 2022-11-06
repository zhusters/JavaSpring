package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class testStudent {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        University uni = context.getBean("universityBean", University.class);
//        uni.addStudents();
//        List<Student> studentList = uni.getStudents();// изменяем параметры в сковозной логике
//        System.out.println(studentList);



        Student student = context.getBean("studentBean", Student.class);
        student.test();

        context.close();

    }
}
