package org.example.exo5.dao;

import org.example.exo5.entity.Dog;
import org.example.exo5.util.SessionFactorySingleton;

import java.util.List;

public class DogDao extends BaseDao<Dog> {

    public DogDao(){super(SessionFactorySingleton.getSession(), Dog.class);}

    public List<Dog> getAll(){
        {
            return session.createQuery("select d from Dog d", Dog.class).getResultList();
        }
    }
}
