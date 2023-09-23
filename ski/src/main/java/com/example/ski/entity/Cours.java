package com.example.ski.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cours")

public class Cours implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCours")
    private Integer idCours;
    private long numCours;
    private int niveau;
    private TypeCours typeCours;
    private Support support;
    private float prix;
    private int creneau;
    @ManyToOne (cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "Cours_Moniteur",
            joinColumns = @JoinColumn(name = "idCours"),
            inverseJoinColumns = @JoinColumn(name = "idMoniteur"))
    private Skieur moniteur;

}
