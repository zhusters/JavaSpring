package Hibernate_OneToMany_BiDir.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Override
    public String toString() {
        return "Department{" +
                ", id=" + id +
                ", departmentname='" + departmentname + '\'' +
                ", maxsalary=" + maxsalary +
                ", minsalary=" + minsalary +
                '}';
    }

    public void AddEmpToDep(Employee emp) {
        if (emps == null) {
            emps = new ArrayList<>();

        }
            emps.add(emp);
 
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public int getMaxsalary() {
        return maxsalary;
    }

    public void setMaxsalary(int maxsalary) {
        this.maxsalary = maxsalary;
    }

    public int getMinsalary() {
        return minsalary;
    }

    public void setMinsalary(int minsalary) {
        this.minsalary = minsalary;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Employee> emps;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String departmentname;

    @Column(name = "max_salary")
    private int maxsalary;

    @Column(name = "min_salary")
    private int minsalary;



    public Department(String departmentname, int maxsalary, int minsalary) {
        this.departmentname = departmentname;
        this.maxsalary = maxsalary;
        this.minsalary = minsalary;
    }


    public Department() {

    }


}
