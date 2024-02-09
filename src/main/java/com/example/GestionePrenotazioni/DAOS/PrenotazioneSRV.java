package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Edificio;
import com.example.GestionePrenotazioni.Classes.Postazione;
import com.example.GestionePrenotazioni.Classes.Prenotazione;
import com.example.GestionePrenotazioni.Classes.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneSRV {
    @Autowired
    private PrenotazioneDAO pd;

    @Autowired
    PostazioneSRV postazioneSRV;

    @Autowired
    UtenteSRV utenteSRV;
    @Autowired
    private UtenteDAO utenteDAO;


    public void save(Prenotazione prenotazione) {
        boolean isOccupied = pd.existsByDataPrenotazioneAndUtenteAndPostazione(prenotazione.getDataPrenotazione(), prenotazione.getUtente(), prenotazione.getPostazione());
        if (!isOccupied) {
            pd.save(prenotazione);
        } else {
            System.out.println("Prenotazione non effettuata");
        }
    }

    public void delete(Prenotazione prenotazione) {
        pd.delete(prenotazione);
    }


}
