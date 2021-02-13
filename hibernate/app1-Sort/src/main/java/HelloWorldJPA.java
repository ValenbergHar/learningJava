import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldJPA {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        Session session = null;


        session = factory.getCurrentSession();
        session.beginTransaction();

//        HomeAddress homeAddress = new HomeAddress("Batoryja");
//        List<HomeAddress> homeAddresslist = new ArrayList<>();
//        homeAddresslist.add(homeAddress);
//        homeAddresslist.add(new HomeAddress("Kalinouskaha"));
//        List<Integer> marks = new ArrayList<>();
//        marks.add(1);
//        marks.add(3);
//        marks.add(2);
//
//        Person person = new Person("Zianonnnnnn", homeAddresslist, marks);
//
//        session.persist(person);


        Person load = session.load(Person.class, 1);
        System.out.println(load.getMarks());


        session.getTransaction().commit();

    }

}
