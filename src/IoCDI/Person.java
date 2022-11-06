package IoCDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {


    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("person bean was created");

    }

    @Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }


//    @Autowired
//    public Person(Pet pet) {
//        this.pet = pet;
//    }
//    public Person(int age) {
//        this.age = age;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void CallYourPet() {
        System.out.println("come here");
        pet.Say();
    }
}