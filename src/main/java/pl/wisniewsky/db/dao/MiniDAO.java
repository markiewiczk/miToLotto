package pl.wisniewsky.db.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.wisniewsky.model.Mini;

import java.io.Serializable;
import java.util.List;

public class MiniDAO extends SessionDAO<Mini> {

    public MiniDAO(Session session) {
        super(session);
    }

    @Override
    public void save(Mini objectToSave) {
        Transaction transaction = session.beginTransaction();
        session.save(objectToSave);
        transaction.commit();
    }

    @Override
    public Mini get(Serializable id) {
        return null;
    }

    @Override
    public List<Mini> getAll() {
        return null;
    }

    @Override
    public void update(Mini objectToUpdate) {

    }

    @Override
    public void delete(Mini objectToDelete) {

    }

}
