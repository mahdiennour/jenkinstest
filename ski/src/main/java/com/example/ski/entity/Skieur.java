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
@Table(name = "Skieur")

public class Skieur implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSkieur")
    private Integer idSkieur;
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "abonnement_fk")
    private Abonnement abonnement;
    @OneToMany (mappedBy = "skieur" , cascade = CascadeType.ALL)
    private List<Inscription> inscriptions = new ArrayList<>();
    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name = "skieurs_piste",
            joinColumns = @JoinColumn(name = "idpiste"),
            inverseJoinColumns = @JoinColumn(name = "idSkieur"))
    private List<Piste> pistes = new ArrayList<>();

}
