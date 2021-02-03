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
//
        HomeAddress homeAddress = new HomeAddress("Batoryja");
        List<HomeAddress> homeAddresslist = new ArrayList<>();
        homeAddresslist.add(homeAddress);

        Person person = new Person("Zianon", homeAddresslist);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        homeAddress.setPerson(personList);

        session.persist(person);
        session.persist(homeAddress);

//        Person load = session.load(Person.class, 1);
//        List<HomeAddress> homeAddresses = load.getHomeAddressList();
//        System.out.println(homeAddresses);



        session.getTransaction().commit();

    }

}
