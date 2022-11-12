package Hibernate_OneToMany_BiDir;

//import HibernateImproved.Entity.Employee;

import Hibernate_OneToMany_UniDir.Entity.Department;
import Hibernate_OneToMany_UniDir.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test1 {
    public static void main(String[] args) {

        //Hibernate API to save this objects to DB
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = new Department("it", 100,777);

            Employee emp1 = new Employee("sanya","zhuravlev",300);
            Employee emp2 = new Employee("david","kurepin",500);

            department.AddEmpToDep(emp1);
            department.AddEmpToDep(emp2);


            session.save(department);



           Department deptable = session.get(Department.class,1);
            System.out.println( deptable.getEmps()) ;

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}