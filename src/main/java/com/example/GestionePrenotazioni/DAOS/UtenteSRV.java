package com.example.GestionePrenotazioni.DAOS;

import com.example.GestionePrenotazioni.Classes.Utente;
import org.springframework.beans.factory.annotation.Autowired;

public class UtenteSRV {
    @Autowired
    private UtenteDAO ud;

    public void save(Utente utente){
        ud.save(utente);

    }

    public void delete(Utente utente){
        ud.delete(utente);
    }




}
