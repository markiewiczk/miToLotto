package pl.wisniewsky.db;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public enum SessionProvider {
    INSTANCE;

    private static final String CONFIG_FILE_NAME = "hibernate.cfg.xml";
    private final SessionFactory factory;

    SessionProvider() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure(CONFIG_FILE_NAME).build();
        final Metadata metadata = new MetadataSources(registry).buildMetadata();
        factory = metadata.buildSessionFactory();
    }

    public Session getSession() {
        return factory.openSession();
    }

    public boolean closeFactory() {
        try {
            factory.close();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }
}
