package org.example.exo4.repository;

import org.example.exo4.entity.Travellog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravellogRepository extends JpaRepository<Travellog, Long> {


}

