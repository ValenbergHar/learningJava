import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class HelloWorldJPA {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Message.class)
                .buildSessionFactory();

        Session session = null;


        session = factory.getCurrentSession();
        session.beginTransaction();
        Message message = new Message("Zianon");
//        Message message = new Message();
       // message.setText("Stas");
        session.save(message);
        session.getTransaction().commit();

    }

}
