package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Edificio;
import com.example.GestionePrenotazioni.Classes.Postazione;
import com.example.GestionePrenotazioni.Classes.Prenotazione;
import com.example.GestionePrenotazioni.Enums.TipoPostazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneSRV {
    @Autowired
    private PostazioneDAO psd;
    @Autowired
    private EdificioSRV edificioSRV;

    public void save(Postazione postazione) {
        psd.save(postazione);

    }

    public void delete(Postazione postazione) {
        psd.delete(postazione);
    }

    public void findPostazione(TipoPostazione tipo, String citta) {
        Edificio edificioTrovato = edificioSRV.getEdificioByCitta(citta);
        List<Postazione> postTrovata = psd.findByTipoAndEdificio(tipo, edificioTrovato);
        System.out.println(postTrovata);
    }
}
