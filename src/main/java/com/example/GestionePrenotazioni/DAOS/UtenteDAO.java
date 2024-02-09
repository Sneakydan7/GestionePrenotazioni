package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAO extends JpaRepository<Utente,Long> {



}
