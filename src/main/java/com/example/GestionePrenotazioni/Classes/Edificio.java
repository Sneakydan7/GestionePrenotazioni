package com.example.GestionePrenotazioni.Classes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "numero_edificio", nullable = false)
    private Long numero_edificio;

    private String nomeEdificio;

    private String indirizzo;

    private String citta;

    public Edificio(String nomeEdificio, String indirizzo, String citta) {
        this.nomeEdificio = nomeEdificio;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }
}
