package pl.wisniewsky.db.dao;

import org.hibernate.Session;

public abstract class SessionDAO<T> implements DAO<T> {
    public static final String SELECT_ALL_QUERY = "FROM Lotto";

    protected final Session session;

    public SessionDAO(Session session) {
        this.session = session;
    }

    public void close() {
        session.close();
    }
}
