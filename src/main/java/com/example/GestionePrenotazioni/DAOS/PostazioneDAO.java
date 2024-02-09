package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Edificio;
import com.example.GestionePrenotazioni.Classes.Postazione;
import com.example.GestionePrenotazioni.Enums.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {

    List<Postazione> findByTipoAndEdificio(TipoPostazione tipo, Edificio edificio);


}
