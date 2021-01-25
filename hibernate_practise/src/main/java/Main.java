import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //private static List<Person> personList;
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(OrderKey.class)
                .buildSessionFactory();

        // CRUD
        Session session = null;

        try{
            session = factory.getCurrentSession();
            session.beginTransaction();

            Person person= (Person) session.createQuery("FROM Person p WHERE p.id =2");
         //   personList.add(person);
            System.out.println(person);
            session.getTransaction().commit();

        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}
