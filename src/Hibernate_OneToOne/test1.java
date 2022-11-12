package Hibernate_OneToOne;

//import HibernateImproved.Entity.Employee;

import Hibernate_OneToOne.Entity.Detail;
import Hibernate_OneToOne.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test1 {
    public static void main(String[] args) {

        //Hibernate API to save this objects to DB
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            Employee emp = new Employee("123", "123", "it", 1000);
            Detail det = new Detail("Astana", "+1243422", "gmail");



            det.setEmployee(emp);
            emp.setEmpDetail(det);
            session.beginTransaction();

           Detail deldet = session.get(Detail.class,3);
           session.delete(deldet);


            session.save(emp);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}