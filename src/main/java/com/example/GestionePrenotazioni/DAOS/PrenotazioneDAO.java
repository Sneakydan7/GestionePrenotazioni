package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione , Long> {

}
