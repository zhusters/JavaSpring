package IoCDIwithClassConfig;

import IoCDI.Pet;
import org.springframework.beans.factory.annotation.Value;


public class Person {


    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("person bean was created");

    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }





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
