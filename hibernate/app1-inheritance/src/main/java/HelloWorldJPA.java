import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldJPA {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();

        Session session = null;
        session = factory.getCurrentSession();
        session.beginTransaction();

        Car car = new Car("213");
        Car car1 = new Opel("213", 20000);
        Car car2 = new Toyota("213", 120);
        session.persist(car);
        session.persist(car1);
        session.persist(car2);

        session.getTransaction().commit();

    }

}
