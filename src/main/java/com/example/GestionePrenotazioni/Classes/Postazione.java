package com.example.GestionePrenotazioni.Classes;

import com.example.GestionePrenotazioni.Enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codice_univoco", nullable = false)
    private Long codice_univoco;


    private String descrizione;

    private TipoPostazione tipo;

    private int numeroOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_numero_edificio")
    private Edificio edificio;

}
