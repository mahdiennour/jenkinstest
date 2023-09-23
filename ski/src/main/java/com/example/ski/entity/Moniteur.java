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
@Table(name = "Moniteur")

public class Moniteur implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMoniteur")
    private Integer idMoniteur;
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;
    @OneToMany (mappedBy = "moniteur", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Cours> cours = new ArrayList<>();

}
