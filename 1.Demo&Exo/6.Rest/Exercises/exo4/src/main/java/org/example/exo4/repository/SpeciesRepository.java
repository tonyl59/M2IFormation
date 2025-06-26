package org.example.exo4.repository;

import org.example.exo4.entity.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Long> {
/*    @Query("select f from Film f where f.realisateur.id = ?1")
    List<Film> findAllByRealisateur (long idRealisateur);

    long id(long id);*/
}
