package com.example.ski.service;

import com.example.ski.entity.Inscription;

import java.util.List;


public interface IInscriptionService {
    public List<Inscription> retrieveAllInscription();
    public Inscription retrieveInscription(Integer idInscription);
    public Inscription addInscription(Inscription p);
    public void removeInscription(Integer idInscription);
    public Inscription modifyInscription(Inscription Inscription);
// Here we will add later methods calling keywords and methods calling JPQL
}
