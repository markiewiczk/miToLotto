package pl.wisniewsky.db.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.wisniewsky.model.Lotto;

import java.io.Serializable;
import java.util.List;

public class LottoDAO extends SessionDAO<Lotto> {

    public LottoDAO(Session session) {
        super(session);
    }

    @Override
    public void save(Lotto objectToSave) {
        Transaction transaction = session.beginTransaction();
        session.save(objectToSave);
        transaction.commit();
    }

    @Override
    public Lotto get(Serializable id) {
        return session.get(Lotto.class, id);
    }

    @Override
    public List<Lotto> getAll() {
        return session.createQuery(SELECT_ALL_QUERY).getResultList();
    }

    @Override
    public void update(Lotto objectToUpdate) {
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(objectToUpdate);
        session.evict(objectToUpdate);
        transaction.commit();
    }

    @Override
    public void delete(Lotto objectToDelete) {
        Transaction transaction = session.beginTransaction();
        session.delete(objectToDelete);
        transaction.commit();
    }

}
