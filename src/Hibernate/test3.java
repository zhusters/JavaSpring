package Hibernate;

import Hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test3 {
    public static void main(String[] args) {

        //Hibernate API to save this objects to DB
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Employee emp = new
                Employee("sanya", "zhuravlelv", "it", 1000);

        Employee emptwo = new
                Employee("test", "test surname", "tt", 777);


        try {
            // запись обьекта в бд
            // открывается когда пишем запрос insert
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            // запись обьекта в бд
            // открывается когда пишем запрос insert
            Session session1 = factory.getCurrentSession();
            session1.beginTransaction();
            session1.save(emptwo);
            session1.getTransaction().commit();


            // получение обьекта из бд
            Session session2  = factory.getCurrentSession();
            session2.beginTransaction();
            Employee emp3 = session2.get(Employee.class,2);
            session2.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}