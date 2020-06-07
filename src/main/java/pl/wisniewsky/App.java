package pl.wisniewsky;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pl.wisniewsky.model.Lotto;

import java.util.Date;

public class App {
    private static SessionFactory factory;

    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Lotto lotto = new Lotto(1, "37,16,19,31,2,4", new Date(), 444);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(lotto);
//        Lotto lotto = session.get(Lotto.class, 1);
        transaction.commit();
        session.close();
    }
}
