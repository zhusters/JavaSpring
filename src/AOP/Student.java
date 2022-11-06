package AOP;

import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
    private String name;
    private int course;
    private int averagegrade;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getAveragegrade() {
        return averagegrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAveragegrade(int averagegrade) {
        this.averagegrade = averagegrade;
    }

    public Student(String name, int course, int averagegrade) {
        this.name = name;
        this.course = course;
        this.averagegrade = averagegrade;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", averagegrade=" + averagegrade +
                '}';
    }



    public void test(){
        System.out.println("test");
    }
}
