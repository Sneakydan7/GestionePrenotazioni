package com.example.GestionePrenotazioni;

import com.example.GestionePrenotazioni.Classes.Edificio;
import com.example.GestionePrenotazioni.Classes.Postazione;
import com.example.GestionePrenotazioni.Classes.Prenotazione;
import com.example.GestionePrenotazioni.Classes.Utente;
import com.example.GestionePrenotazioni.DAOS.EdificioSRV;
import com.example.GestionePrenotazioni.DAOS.PostazioneSRV;
import com.example.GestionePrenotazioni.DAOS.PrenotazioneSRV;
import com.example.GestionePrenotazioni.DAOS.UtenteSRV;
import com.example.GestionePrenotazioni.Enums.TipoPostazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class GestionePrenotazioniRunner implements CommandLineRunner {


    @Autowired
    UtenteSRV utenteSRV;
    @Autowired
    EdificioSRV edificioSRV;

    @Autowired
    PostazioneSRV postazioneSRV;

    @Autowired
    PrenotazioneSRV prenotazioneSRV;


    @Override
    public void run(String... args) throws Exception {
        Utente utente1 = new Utente("sneakydan", "Daniele Cagnoni", "daniele.010@hotmail.it");
        utenteSRV.save(utente1);

        Edificio edificio1 = new Edificio("Palazzo mori", "Piazza Marchisi", "Roma");
        edificioSRV.save(edificio1);

        Postazione postazione1 = new Postazione("Spazio Co-Working", TipoPostazione.PRIVATO, 5, edificio1);
        postazioneSRV.save(postazione1);

        Prenotazione prenotazione1 = new Prenotazione(utente1, postazione1, LocalDate.now());
        prenotazioneSRV.save(prenotazione1);
        Prenotazione prenotazione2 = new Prenotazione(utente1, postazione1, LocalDate.now());
        prenotazioneSRV.save(prenotazione2);
        // Prenotazione 2 non verrà effettuata perchè gia esiste una prenotazione dell'utente in quello stesso giorno

    }
}
