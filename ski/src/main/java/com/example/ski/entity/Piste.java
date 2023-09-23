package com.example.ski.entity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Piste")


public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpiste")
    private Integer idPiste;
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;
    @ManyToMany (mappedBy = "pistes" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Skieur> skieurs = new ArrayList<>();

}
