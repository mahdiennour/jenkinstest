package com.example.ski.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Abonnement")

public class Abonnement implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAbonnement")
    private Integer idAbonnement;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbo;
    @OneToOne (mappedBy = "abonnement" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "skieur_fk")
    private Skieur skieur;



}
