package org.example.Demos.Demo1.dao;

import org.example.Demos.Demo1.entity.Personne;
import org.hibernate.Session;

import java.util.List;

public class PersonneDao {

    private Session session;

    public PersonneDao(Session session){
        this.session = session;
    }

    public Personne save (Personne personne){
        session.beginTransaction();
        //session.getTransaction().begin();
        session.saveOrUpdate(personne);
        session.getTransaction().commit();
        return personne;
    }

    public boolean delete (Personne personne){
        session.beginTransaction();
        session.delete(personne);
        session.getTransaction().commit();
        return true;
    }

    public Personne get (int id){
        return session.get(Personne.class, id);
    }

    public List<Personne> get(){
        return session.createQuery("select p from Personne p", Personne.class).getResultList();
    }

    public Double ageMoyen(){
        return session.createQuery("select avg(p.age) from Personne p", Double.class).uniqueResult(); // Il y a aussi get unique result
    }
}
