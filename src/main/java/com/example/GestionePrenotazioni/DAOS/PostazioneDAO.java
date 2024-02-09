package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDAO  extends JpaRepository<Postazione , Long> {
}
