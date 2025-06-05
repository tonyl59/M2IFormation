package org.example.Exercises.exo1.dao;

import org.hibernate.Session;


public abstract class BaseDao<T> {
    protected Session session;
    protected Class<T> type;

    public BaseDao(Session session ,Class<T> type) {
        this.type = type;
        this.session = session;
    }

    public T save (T element){
        try {
            session.beginTransaction();
            //session.getTransaction().begin();
            session.saveOrUpdate(element);
            session.getTransaction().commit();
            return element;
        }catch (Exception ex){
            session.getTransaction().rollback();
            return null;
        }
    }

    public boolean delete (T element){
        try {
            session.beginTransaction();
            session.delete(element);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            session.getTransaction().rollback();
            return false;
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




    /*
    *     public List<Object[]> get_by_below_stock_max(int max){
        TypedQuery <Object[]> query= session.createQuery("Select p.id, p.reference from Product p WHERE p.stock < :max", Object[].class);
        query.setParameter("max",max);
        return query.getResultList();*/