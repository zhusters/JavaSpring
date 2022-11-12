package Hibernate;

import Hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class test2 {
    public static void main(String[] args) {

        //Hibernate API to save this objects to DB
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Employee emp = new
                Employee("sanya", "zhuravlelv", "it", 1000);

        Employee emptwo = new
                Employee("test", "test surname", "tt", 777);


        Session session = factory.getCurrentSession();
        session.beginTransaction();
        //session.createQuery("UPDATE Employee set salary = 111 where name = 'sanya'").executeUpdate();
        //        Employee empdel = session.get(Employee.class, 2);
        //session.delete(empdel);
        // или удалени по условию
        session.createQuery("DELETE Employee WHERE name = 'sanya'").executeUpdate();
//            Employee empchange = session.get(Employee.class, 6);
//            empchange.setSalary(7777777);
//            List<Employee> emps = session.createQuery("from Employee where name = 'sanya' and salary =777").getResultList();
//            for (Employee e : emps) {
//                System.out.println(e);
        session.getTransaction().commit();
        //           }
        factory.close();

    }
}