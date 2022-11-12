package Hibernate_ManyToMany;

import Hibernate_ManyToMany.Entity.Child;
import Hibernate_ManyToMany.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();


        Session session = null;

        try {

            //  добавление обьектов к секции
//            session = factory.getCurrentSession();
//
//            Section one = new Section("swiming");
//            Child child1 = new Child("david", 20);
//            Child child2 = new Child("sanya", 20);
//            Child child3 = new Child("lena", 20);
//            Child child4 = new Child("vera", 20);
//
//            one.addChildToSection(child1);
//            one.addChildToSection(child2);
//            one.addChildToSection(child3);
//            one.addChildToSection(child4);
//
//            session.beginTransaction();
//
//            session.save(one);
//
//
//            session.getTransaction().commit();
//

// добавление секций к обьекту

            session = factory.getCurrentSession();

            Section one = new Section("swiming");
            Section two = new Section("football");
            Section three = new Section("chess");
            Section four = new Section("gambling");

            Child child1 = new Child("david", 20);



            session.beginTransaction();


            child1.addSectionToChild(one);
            child1.addSectionToChild(two);
            child1.addSectionToChild(three);
            child1.addSectionToChild(four);

            session.save(child1);



            session.getTransaction().commit();



        } finally {
            session.close();
            factory.close();
        }
    }
}
