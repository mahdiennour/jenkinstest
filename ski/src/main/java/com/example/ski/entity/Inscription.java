package com.example.ski.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Inscription")

public class Inscription implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInscription")
    private Integer idInscription;
    private long numInscription;
    private int numSemaine;
    @ManyToOne (cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "skieur_fk")
    private Skieur skieur;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @ToString.Exclude
    private Cours cours;
}
