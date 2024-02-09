package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Edificio;
import com.example.GestionePrenotazioni.Classes.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;

public class EdificioSRV {
    @Autowired
    private EdificioDAO ed;

    public void save(Edificio edificio){
        ed.save(edificio);

    }

    public void delete( Edificio edificio){
        ed.delete(edificio);
    }
}
