package Hibernate.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surnamename;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private int salary;
    public Employee() {
    }
    public Employee(String name, String surnamename, String department, int salary) {
        this.name = name;
        this.surnamename = surnamename;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surnamename='" + surnamename + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurnamename(String surnamename) {
        this.surnamename = surnamename;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurnamename() {
        return surnamename;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
}
