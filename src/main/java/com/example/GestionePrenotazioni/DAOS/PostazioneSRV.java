package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Postazione;
import com.example.GestionePrenotazioni.Classes.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;

public class PostazioneSRV {
    @Autowired
    private PostazioneDAO psd;

    public void save(Postazione postazione){
        psd.save(postazione);

    }

    public void delete(Postazione postazione){
        psd.delete(postazione);
    }
}
