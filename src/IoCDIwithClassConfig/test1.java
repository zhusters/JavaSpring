package IoCDIwithClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person p = context.getBean("personBean", Person.class);
        p.CallYourPet();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        context.close();
    }



}
