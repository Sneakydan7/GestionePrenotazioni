package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Postazione;
import com.example.GestionePrenotazioni.Classes.Prenotazione;
import com.example.GestionePrenotazioni.Classes.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {


    boolean existsByDataPrenotazioneAndUtenteAndPostazione(LocalDate data, Utente utente, Postazione postazione);


}
