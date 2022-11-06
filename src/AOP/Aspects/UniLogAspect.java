package AOP.Aspects;


import AOP.Student;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniLogAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLogAdvice(){
        System.out.println("beforeGetStudentsLogAdvice:BEFORE");
    }



    // меняем результат таргет метода
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLogAdvice(List<Student> students){
        Student firstStudents = students.get(0);
        String name = firstStudents.getName();
        name = "Mr"+name;
        firstStudents.setName(name);

        int grade = firstStudents.getAveragegrade();
        grade = grade+777;
        firstStudents.setAveragegrade(grade);

        System.out.println("afterGetStudentsLogAdvice:AFTER");
    }


}
