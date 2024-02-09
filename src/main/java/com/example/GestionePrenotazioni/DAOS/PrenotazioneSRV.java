package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Prenotazione;
import com.example.GestionePrenotazioni.Classes.Utente;
import org.springframework.beans.factory.annotation.Autowired;

public class PrenotazioneSRV {
    @Autowired
    private PrenotazioneDAO pd;

    public void save(Prenotazione prenotazione){
        pd.save(prenotazione);

    }

    public void delete(Prenotazione prenotazione){
        pd.delete(prenotazione);
    }

}
