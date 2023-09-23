package com.example.ski.service;

import com.example.ski.entity.Skieur;

import java.util.List;


public interface ISkieurService {
    public List<Skieur> retrieveAllSkieur();
    public Skieur retrieveSkieur(Integer idSkieur);
    public Skieur addSkieur(Skieur p);
    public void removeSkieur(Integer idSkieur);
    public Skieur modifySkieur(Skieur Skieur);
// Here we will add later methods calling keywords and methods calling JPQL
}
