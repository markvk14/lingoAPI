package com.project.lingo.Data.repository;

import com.project.lingo.Domain.Speler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpelerRepository extends JpaRepository<Speler, Long> {
    Speler findByEmail(String email);
    Speler findByGebruikersnaam(String gebruikersnaam);
}
