package com.example.GestionePrenotazioni.Classes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "numero_edificio", nullable = false)
    private Long numero_edificio;

    private String nomeEdificio;

    private String indirizzo;

    private String citta;


}
