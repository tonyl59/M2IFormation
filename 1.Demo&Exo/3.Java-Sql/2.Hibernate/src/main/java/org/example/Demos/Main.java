package org.example.Demos;

import org.example.Demos.Demo1.dao.PersonneDao;
import org.example.Demos.Demo1.entity.Personne;
import org.example.Demos.Demo1.util.SessionFactorySingleton;

public class Main {
    public static void main(String[] args) {

        PersonneDao personneDao = new PersonneDao(SessionFactorySingleton.getSession());
/*
        Personne personne = Personne.builder().name("toto").age(22).build();

        //personneDao.save(personne);

        Personne personneFound = personneDao.get(2);
        personneFound.setName("tata");
        personneDao.save(personneFound);

*/
        Personne personne2 = Personne.builder().name("tonton").age(12).build();
        personneDao.save(personne2);
        System.out.println(personneDao.ageMoyen());

    }
}
