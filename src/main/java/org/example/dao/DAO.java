package org.example.dao;

import java.io.Serializable;

public interface DAO<T> {

    void save(T objectToSave);
    T get(Serializable id);
    void delete(T objectToDelete);
    void update(T objectToUpdate);
}
