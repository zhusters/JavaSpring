package IoCDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        pet.Say();


//        Person person = context.getBean("myPerson", Person.class);
//        System.out.println(person.getAge());
//        System.out.println(person.getName());
//        person.CallYourPet();


//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.Say();


        Person p = context.getBean("personBean", Person.class);
        p.CallYourPet();
        System.out.println(p.getName());
        System.out.println(p.getAge());

        Dog myDog = context.getBean("dogBean", Dog.class);
        myDog.Say();


        context.close();
    }
}
