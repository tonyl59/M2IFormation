package org.example.exo5.dao;

import org.example.exo5.entity.Dog;
import org.hibernate.Session;

import java.util.List;

public abstract class BaseDao<T> {
    protected Session session;
    protected Class<T> type;

    public BaseDao(Session session, Class<T> type) {
        this.type = type;
        this.session = session;
    }

    public T save (T element){
        try {
            session.beginTransaction();
            session.saveOrUpdate(element);
            session.getTransaction().commit();
            return element;
        }catch (Exception ex){
            session.getTransaction().rollback();
            return null;
        }
    }

    public T get(int id){
        try{
            return session.get(type, id);
        }catch (Exception ex){
            return null;
        }
    }



}
