import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldJPA {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;


        session = factory.getCurrentSession();
        session.beginTransaction();
//        for (int i = 0; i<10; i++){
//        Message m1= new Message("Zianon"+i);
//        session.save(m1);
//    }
//        Person m3 = session.load(Person.class, 5);
//        Person m5 = session.get(Person.class, 105);
//        System.out.println(m3.getText());
//        System.out.println(m5.getText());


//        Student person = new Student("Zianon");
//        person.setAddress(new Address("Kastr", 1));

        HomeAddress homeAddress = new HomeAddress("Batoryja");
        List<HomeAddress> list = new ArrayList<>();
        list.add(homeAddress);
        Person person = new Person("Zianon", list);
        homeAddress.setPerson(person);
        session.persist(person);
        session.persist(homeAddress);
        session.getTransaction().commit();

    }

}
