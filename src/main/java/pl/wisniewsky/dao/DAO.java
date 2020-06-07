package pl.wisniewsky.dao;

import java.io.Serializable;
import java.util.List;

public interface DAO<T> {

    void save(T objectToSave);

    T get(Serializable id);

    List<T> getAll();

    void update(T objectToUpdate);

    void delete(T objectToDelete);

}
