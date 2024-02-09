package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDAO extends JpaRepository<Edificio, Long> {

    Edificio findByCitta(String nome);
}
