import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloWorldJPA {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Message.class)
                .buildSessionFactory();

        Session session = null;


        session = factory.getCurrentSession();
        session.beginTransaction();
        Message message = new Message();
        message.setText("Hello World!");
        session.save(message);
        session.getTransaction().commit();

    }

}
